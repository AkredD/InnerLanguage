/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.ExecutionException;
import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.BaseValueImpl;
import cs.service.innerlanguage.translator.context.BinaryBoolExprImpl;
import cs.service.innerlanguage.translator.context.BinaryConditionImpl;
import cs.service.innerlanguage.translator.context.BinaryExpressionImpl;
import cs.service.innerlanguage.translator.context.ExpressionContext;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.context.NullImpl;
import cs.service.innerlanguage.translator.context.TypeImpl;
import cs.service.innerlanguage.translator.context.UnaryConditionImpl;
import cs.service.innerlanguage.translator.context.UnaryExpressionImpl;
import cs.service.innerlanguage.translator.context.VariableValueImpl;
import cs.service.innerlanguage.translator.statements.CallFunctionImpl;
import cs.service.innerlanguage.translator.statements.ConstantDefinitionImpl;
import cs.service.innerlanguage.translator.statements.DataDefinitionImpl;
import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.translator.statements.IfImpl;
import cs.service.innerlanguage.translator.statements.StatementContext;
import cs.service.innerlanguage.translator.statements.WhileImpl;
import cs.service.innerlanguage.provider.types.TypeMethod;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.utils.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class InspectManager {
	private Map<String, FunctionImpl> functionContext = new HashMap();
	private Map<String, DataStatement> variableContext = new HashMap();
	private final List<IInspector> inspectors = new ArrayList();
	private TypeImpl visitingType;

	public InspectManager() {
		IInspector[] inspectors = {new ContextInspector(this), new ReturnOrderInspector(this),
											new ReturnTypeInspector(this), new ContinueBreakInspector(this),
											new EqInspector(this), new CallTypeInspector(this),
											new WriteInspector(this)};
		this.inspectors.addAll(Arrays.asList(inspectors));
	}

	public Map<String, FunctionImpl> getFunctionContext() {
		return functionContext;
	}

	public Map<String, DataStatement> getVariableContext() {
		return variableContext;
	}

	public void inspectType(TypeImpl type) {
		this.visitingType = type;
		if (type.getFunctions() == null || type.getFunctions().isEmpty()) {
			handleException(ExceptionMessage.METHODS_DOESNT_EXISTS, type.getTypeName(), type.getStart());
		}
		type.getFunctions().forEach(foo -> {
			if (functionContext.containsKey(foo.getFunctionName())) {
				handleException(ExceptionMessage.DUPLICATE_FUNCTION_NAME, foo.getStart(), foo.getFunctionName());
			}
			functionContext.put(foo.getFunctionName(), foo);
		});
		MainProvider.instance().registerType(type);
		if (type.getStaticBlock() != null && !type.getStaticBlock().isEmpty()) {
			variableContext = type.getStaticBlock()
					  .stream()
					  .peek(varInit -> {
						  checkDataInitialization(varInit);
					  })
					  .collect(Collectors.toMap(
								 varInit -> {
									 return varInit.getDataName();
								 }, varInit -> {
									 return varInit;
								 }));
		}
		//inspect functions
		type.getFunctions().forEach(foo -> {
			inspectors.forEach(inspector -> {
				if (inspector.getInspectingSubjects().contains(foo.getClass())) {
					inspector.startInspecting(foo);
				}
			});
			inspectInnerStatements(foo.getInnerStatements());
			inspectors.forEach(inspector -> {
				if (inspector.getInspectingSubjects().contains(foo.getClass())) {
					inspector.endInspecting(foo);
				}
			});
		});
	}

	//inspect statements
	private void inspectInnerStatements(List<StatementContext> statements) {
		statements.forEach(statement -> {
			if (statement instanceof IfImpl) {
				TypeWrapper conditionType = getExpressionContextType(((IfImpl) statement).getIfCondition());
				if (!conditionType.equals(MainProvider.instance().getBasicTypeByName("Boolean"))) {
					handleException(ExceptionMessage.INCOMPATIBLE_TYPES, statement.getStart(), conditionType.getClassName(), MainProvider.instance().getBasicTypeByName("Boolean").getClassName());
				}
				inspectors.forEach(inspector -> {
					if (inspector.getInspectingSubjects().contains(statement.getClass())) {
						inspector.startInspecting(statement);
					}
				});
				//inspect main if block
				if (((IfImpl) statement).getMainBlockPart() != null) {
					inspectInnerStatements(((IfImpl) statement).getMainBlockPart());
				}
				inspectors.forEach(inspector -> {
					if (inspector.getInspectingSubjects().contains(statement.getClass())) {
						inspector.endInspecting(statement);
					}
				});
				if (((IfImpl) statement).getElseBlockPart() != null) {
					inspectors.forEach(inspector -> {
						if (inspector.getInspectingSubjects().contains(statement.getClass())) {
							inspector.startInspecting(statement);
						}
					});
					//inspect else if block
					if (((IfImpl) statement).getElseBlockPart() != null) {
						inspectInnerStatements(((IfImpl) statement).getElseBlockPart());
					}
					inspectors.forEach(inspector -> {
						if (inspector.getInspectingSubjects().contains(statement.getClass())) {
							inspector.endInspecting(statement);
						}
					});
				}
				return;
			}
			if (statement instanceof WhileImpl) {
				TypeWrapper conditionType = getExpressionContextType(((WhileImpl) statement).getWhileCondition());
				if (!conditionType.equals(MainProvider.instance().getBasicTypeByName("Boolean"))) {
					handleException(ExceptionMessage.INCOMPATIBLE_TYPES, statement.getStart(), conditionType.getClassName(), MainProvider.instance().getBasicTypeByName("Boolean").getClassName());
				}
				inspectors.forEach(inspector -> {
					if (inspector.getInspectingSubjects().contains(statement.getClass())) {
						inspector.startInspecting(statement);
					}
				});
				if (((WhileImpl) statement).getInnerStatements() != null) {
					inspectInnerStatements(((WhileImpl) statement).getInnerStatements());
				}
				inspectors.forEach(inspector -> {
					if (inspector.getInspectingSubjects().contains(statement.getClass())) {
						inspector.endInspecting(statement);
					}
				});
				return;
			}
			inspectors.forEach(inspector -> {
				if (inspector.getInspectingSubjects().contains(statement.getClass())) {
					inspector.inspect(statement);
				}
			});
		});
	}

	//TODO empty constructor?
	public void checkDataInitialization(DataStatement data) {
		List<TypeWrapper> valueTypes = (data.getValues() != null) ? getTypesOfVarList.apply(data.getValues(), data.getStart()) : new ArrayList();
		if (data instanceof DataDefinitionImpl || data instanceof ConstantDefinitionImpl) {
			if (data.isInstance() && data.getValues() != null && !data.getValues().isEmpty()) {
				if (data.getType().getConstructors() == null
					 || data.getType().getConstructors().isEmpty()
					 || !findMethod.apply(new Pair<>(null, valueTypes), data.getType().getConstructors()).isPresent()) {
					handleException(ExceptionMessage.NO_SUITABLE_CONSTRUCTORS_FOUND, data.getStart(), data.getType().getClassName(),
										 valueTypes.stream()
										 .map(type -> {
											 return type.getClassPath();
										 })
										 .collect(Collectors.joining(", ")));
				}
			}
		}
	}
	private final BiFunction<Pair<String, List<TypeWrapper>>, List<TypeMethod>, Optional<TypeWrapper>> findMethod = (fooData, methods) -> {
		return methods
				  .stream()
				  .filter(method -> fooData.getKey() == null || method.getMethodName().equals(fooData.getKey()))
				  .filter(method -> {
					  if (fooData.getValue() == null || fooData.getValue().isEmpty()) {
						  return method.getConstructor() == null
									|| method.getConstructor().getParameters() == null
									|| method.getConstructor().getParameters().isEmpty();
					  } else {
						  if (method.getConstructor() == null
								|| method.getConstructor().getParameters() == null
								|| method.getConstructor().getParameters().isEmpty()
								|| method.getConstructor().getParameters().size() != fooData.getValue().size()) {
							  return false;
						  }
						  for (int i = 0; i < method.getConstructor().getParameters().size(); ++i) {
							  if (!fooData.getValue().get(i).isMemberOf(method.getConstructor().getParameters().get(i).getKey())) {
								  return false;
							  }
						  }
						  return true;
					  }
				  })
				  .findFirst()
				  .flatMap(staticMethod -> {
					  return Optional.of(staticMethod.getOutput());
				  });
	};
	private final BiFunction<String, List<TypeMethod>, Optional<TypeMethod>> getRequirdMethodByName = (name, methods) -> {
		return methods.stream()
				  .filter(staticMethod -> staticMethod.getMethodName().equals(name))
				  .findFirst();
	};
	private final BiFunction<List<NodeContext>, Token, List<TypeWrapper>> getTypesOfVarList = (vars, start) -> {
		return (vars == null)
				 ? new ArrayList()
				 : vars
				  .stream()
				  .map(value -> {
					  return getVarValueType(value, start);
				  })
				  .collect(Collectors.toList());
	};

	private void handleNoSuitableMethodFound(AbstractNodeContext node, TypeMethod reqMethod, List<TypeWrapper> valueTypes) {
		handleException(ExceptionMessage.NO_SUITABLE_METHOD_FOUND, node.getStart(),
							 (reqMethod.getConstructor() != null
							  && reqMethod.getConstructor().getParameters() != null)
							 ? reqMethod.getConstructor().getParameters()
										.stream()
										.map(parameter -> {
											return parameter.getKey().getClassName() + " " + parameter.getValue();
										})
										.collect(Collectors.joining(", "))
							 : "no parameters",
							 valueTypes.stream()
							 .map(type -> {
								 return type.toString();
							 })
							 .collect(Collectors.joining(", ")));
	}

	public TypeWrapper getCallStatementReturnType(CallFunctionImpl callFoo) {
		List<TypeWrapper> valueTypes = getTypesOfVarList.apply(callFoo.getValues(), callFoo.getStart());
		Optional<TypeWrapper> method = null;
		Optional<TypeMethod> reqMethod = null;
		if (callFoo.getType() == null && callFoo.getVar() == null) {
			//inner method call
			if (!functionContext.containsKey(callFoo.getFunctionName())) {
				handleException(ExceptionMessage.FUNCTION_DOESNT_EXISTS, callFoo.getStart(), callFoo.getFunctionName());
			}
			method = findMethod.apply(new Pair<>(callFoo.getFunctionName(), valueTypes), MainProvider.instance().getBasicTypeByName(visitingType.getTypeName()).getAllMethods());
			reqMethod = getRequirdMethodByName.apply(callFoo.getFunctionName(), MainProvider.instance().getBasicTypeByName(visitingType.getTypeName()).getAllMethods());
			if (!method.isPresent()) {
				if (!reqMethod.isPresent()) {
					handleException(ExceptionMessage.TYPE_HAS_NO_STATIC_METHODS_WITH_THIS_NAME, callFoo.getStart(),
										 visitingType.getTypeName(), callFoo.getFunctionName());
				}
				handleNoSuitableMethodFound(callFoo, reqMethod.get(), valueTypes);
			}
		} else if (callFoo.getType() != null) {
			//static method call
			if (callFoo.getType().gettAllStaticMethods() == null || callFoo.getType().gettAllStaticMethods().isEmpty()) {
				handleException(ExceptionMessage.NO_COLLABLE_STATIC_METHODS, callFoo.getType().getClassName(), callFoo.getStart());
			}
			method = findMethod.apply(new Pair<>(callFoo.getFunctionName(), valueTypes), callFoo.getType().gettAllStaticMethods());
			if (!method.isPresent()) {
				if (!reqMethod.isPresent()) {
					handleException(ExceptionMessage.TYPE_HAS_NO_STATIC_METHODS_WITH_THIS_NAME, callFoo.getStart(),
										 callFoo.getType().getClassName(), callFoo.getFunctionName());
				}
				handleNoSuitableMethodFound(callFoo, reqMethod.get(), valueTypes);
			}
		} else {
			//object method call
			TypeWrapper callableObjectType = getVariableType(callFoo.getVar());
			if (callableObjectType.getAllMethods() == null || callableObjectType.getAllMethods().isEmpty()) {
				handleException(ExceptionMessage.NO_COLLABLE_METHODS, callFoo.getStart(), callFoo.getVar().getName(), callableObjectType.getClassName());
			}
			method = findMethod.apply(new Pair<>(callFoo.getFunctionName(), valueTypes), callableObjectType.getAllMethods());
			reqMethod = getRequirdMethodByName.apply(callFoo.getFunctionName(), callableObjectType.getAllMethods());
			if (!method.isPresent()) {
				if (!reqMethod.isPresent()) {
					handleException(ExceptionMessage.TYPE_HAS_NO_METHODS_WITH_THIS_NAME, callFoo.getStart(),
										 callFoo.getVar().getName(), callableObjectType.getClassName(), callFoo.getFunctionName());
				}
				handleNoSuitableMethodFound(callFoo, reqMethod.get(), valueTypes);
			}
		}
		callFoo.setMethod(reqMethod.get());
		callFoo.setType(method.get());
		return method.get();
	}

	public TypeWrapper getVarValueType(NodeContext value, Token start) {
		if (value instanceof NullImpl) {
			return MainProvider.instance().getNullType();
		}
		if (value instanceof BaseValueImpl) {
			return ((BaseValueImpl) value).getType();
		}
		if (value instanceof VariableValueImpl) {
			return getVariableType((VariableValueImpl) value);
		}
		if (value instanceof CallFunctionImpl) {
			return getCallStatementReturnType((CallFunctionImpl) value);
		}
		if (ExpressionContext.class.isAssignableFrom(value.getClass())) {
			return getExpressionContextType((ExpressionContext) value);
		}
		handleException(ExceptionMessage.CANT_PARSE_VARVALUE, value.toString(), start);
		return null;
	}

	public TypeWrapper getExpressionContextType(ExpressionContext expr) {
		TypeWrapper exprType = null;
		if (expr instanceof UnaryExpressionImpl) {
			exprType = getVarValueType(((UnaryExpressionImpl) expr).getOperand(), expr.getStart());
			if (!exprType.isMemberOf(MainProvider.instance().getBasicTypeByName("Number"))) {
				handleException(ExceptionMessage.BAD_UNARY_OPERATOR_TYPE, expr.getStart(), ((UnaryExpressionImpl) expr).getOperator(), "Number", exprType.getClassName());
			}
		} else if (expr instanceof UnaryConditionImpl) {
			exprType = getVarValueType(((UnaryConditionImpl) expr).getOperand(), expr.getStart());
			if (!exprType.equals(MainProvider.instance().getBasicTypeByName("Boolean"))) {
				handleException(ExceptionMessage.BAD_UNARY_OPERATOR_TYPE, expr.getStart(), (((UnaryConditionImpl) expr).getOperator()), "Boolean", exprType.getClassName());
			}
		} else if (expr instanceof BinaryExpressionImpl) {
			exprType = getVarValueType(((BinaryExpressionImpl) expr).getLeftOperand(), expr.getStart());
			TypeWrapper secondExprType = getVarValueType(((BinaryExpressionImpl) expr).getRightOperand(), expr.getStart());
			if (exprType.equals(MainProvider.instance().getBasicTypeByName("String"))
				 && secondExprType.equals(MainProvider.instance().getBasicTypeByName("String"))
				 && ((BinaryExpressionImpl) expr).getOperator().equals("+")) {
				return exprType;
			}
			if (!exprType.isMemberOf(MainProvider.instance().getBasicTypeByName("Number"))
				 || !secondExprType.isMemberOf(MainProvider.instance().getBasicTypeByName("Number"))) {
				handleException(ExceptionMessage.BAD_OPERATOR_TYPES, expr.getStart(), (((BinaryExpressionImpl) expr).getOperator()), exprType.getClassName(), secondExprType.getClassName());
			}
			if (!exprType.equals(secondExprType)) {
				handleException(ExceptionMessage.INCOMPATIBLE_TYPES, expr.getStart(), exprType.getClassName(), secondExprType.getClassName());
			}
		} else if (expr instanceof BinaryConditionImpl) {
			exprType = getVarValueType(((BinaryConditionImpl) expr).getLeftOperand(), expr.getStart());
			TypeWrapper secondExprType = getVarValueType(((BinaryConditionImpl) expr).getRightOperand(), expr.getStart());
			if ((((BinaryConditionImpl) expr).getOperator().equals("==") || ((BinaryConditionImpl) expr).getOperator().equals("<>"))) {
				if ((exprType.isMemberOf(secondExprType) || exprType.isAssignableFrom(secondExprType))) {
					return MainProvider.instance().getBasicTypeByName("Boolean");
				} else {
					handleException(ExceptionMessage.INCOMPATIBLE_TYPES, expr.getStart(), exprType.getClassName(), secondExprType.getClassName());
				}
			}
			if (!secondExprType.equals(MainProvider.instance().getBasicTypeByName("Boolean"))
				 || !exprType.equals(MainProvider.instance().getBasicTypeByName("Boolean"))) {
				handleException(ExceptionMessage.BAD_OPERATOR_TYPES, expr.getStart(), (((BinaryConditionImpl) expr).getOperator()), exprType.getClassName(), secondExprType.getClassName());
			}
		} else if (expr instanceof BinaryBoolExprImpl) {
			exprType = getVarValueType(((BinaryBoolExprImpl) expr).getLeftOperand(), expr.getStart());
			TypeWrapper secondExprType = getVarValueType(((BinaryBoolExprImpl) expr).getRightOperand(), expr.getStart());
			if ((((BinaryBoolExprImpl) expr).getOperator().equals("==") || ((BinaryBoolExprImpl) expr).getOperator().equals("<>"))) {
				if ((exprType.isMemberOf(secondExprType) || exprType.isAssignableFrom(secondExprType))) {
					if (exprType.isMemberOf(secondExprType)) {
						return secondExprType;
					} else {
						return exprType;
					}
				} else {
					handleException(ExceptionMessage.INCOMPATIBLE_TYPES, expr.getStart(), exprType.getClassName(), secondExprType.getClassName());
				}
			}
			if (!exprType.isMemberOf(MainProvider.instance().getBasicTypeByName("Number"))
				 || !secondExprType.isMemberOf(MainProvider.instance().getBasicTypeByName("Number"))) {
				handleException(ExceptionMessage.BAD_OPERATOR_TYPES, expr.getStart(), (((BinaryExpressionImpl) expr).getOperator()), exprType.getClassName(), secondExprType.getClassName());
			}
			if (!exprType.equals(secondExprType)) {
				handleException(ExceptionMessage.INCOMPATIBLE_TYPES, expr.getStart(), exprType.getClassName(), secondExprType.getClassName());
			}
			return MainProvider.instance().getBasicTypeByName("Boolean");
		} else if (expr instanceof ExpressionContext) {
			return getVarValueType(expr.getInner(), expr.getStart());
		}
		return exprType;
	}

	public TypeWrapper getVariableType(VariableValueImpl var) {
		if (!variableContext.containsKey(var.getName())) {
			handleException(ExceptionMessage.VARIABLE_DOESNT_EXISTS, var.getName(), var.getStart());
		}
		if (var.getCastType() != null) {
			if (!variableContext.get(var.getName()).getType().isMemberOf(var.getCastType())) {
				handleException(ExceptionMessage.TYPE_CAST_EXCEPTION, var.getCastType().getClassName(), var.getStart());
			}
			return var.getCastType();
		} else {
			return variableContext.get(var.getName()).getType();
		}
	}

	public void handleException(ExceptionMessage cause, String details, Token start) {
		handleException(cause, start, details);
	}

	public void handleException(ExceptionMessage cause, Token start, String... details) {
		String message = String.format(cause.getLocalizedMessage(), (Object[]) details);
		throw new ExecutionException(message, start.getLine(), start.getCharPositionInLine());
	}
}
