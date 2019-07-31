/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.provider.types.TypeMethod;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.context.TypeImpl;
import cs.service.innerlanguage.utils.Pair;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author anisimov_a_v
 */
public class OverridingInspector extends AbstractInspector {
	private static final Set<Class> inspectingSubjects = new HashSet();
	private Map<Integer, FunctionImpl> methodsHash;

	public OverridingInspector(InspectManager inspectManager) {
		super(inspectManager);
	}

	static {
		Class[] classes = {TypeImpl.class, FunctionImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		if (node instanceof TypeImpl) {
			try {
				Class clazz = Class.forName(((TypeImpl) node).getParentType().getClassPath());
				List<Method> list = Arrays.asList();
				List<Method> expectedMethods = new ArrayList();
				for (Method method : clazz.getDeclaredMethods()) {
					if (Modifier.isAbstract(method.getModifiers())) {
						TypeMethod typeMethod = ((TypeImpl) node).getParentType().findTypeMethodByMethod(method);
						if (typeMethod == null) {
							inspectManager.handleException(ExceptionMessage.CANT_OVERRIDE_THIS_TYPE, ((TypeImpl) node).getStart(),
																	 clazz.getSimpleName(), method.getName());
						}
						Integer typeMethodHash = 31
														 * typeMethod.getConstructor().getParameters().stream()
											 .map(param -> {
												 return param.getKey();
											 })
											 .collect(Collectors.toList())
											 .hashCode() + method.getName().hashCode();
						if (!methodsHash.containsKey(typeMethodHash)) {
							expectedMethods.add(method);
						} else {
							methodsHash.get(typeMethodHash).setOverriding(true);
							if (method.getReturnType().isPrimitive()) {
								methodsHash.get(typeMethodHash).setPrimitive(true);
							}
						}
					}
				}
				if (!expectedMethods.isEmpty()) {
					inspectManager.handleException(ExceptionMessage.REQUIRED_METHODS_DOESNT_EXISTS, ((TypeImpl) node).getStart(), expectedMethods.stream()
															 .map(method -> {
																 return method.getName() + "("
																		  + Arrays.asList(method.getParameterTypes())
																					  .stream()
																					  .map(param -> {
																						  return param.getSimpleName();
																					  })
																					  .collect(Collectors.joining(", "))
																		  + ") from " + method.getDeclaringClass().getSimpleName();
															 })
															 .collect(Collectors.joining("\n ")));
				}
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(OverridingInspector.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	@Override
	public Set<Class> getInspectingSubjects() {
		return inspectingSubjects;
	}

	@Override
	public <T extends NodeContext> void inspect(T node
	) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node
	) {
		if (node instanceof TypeImpl) {
			methodsHash = new HashMap<>();
		}
		if (node instanceof FunctionImpl) {
			methodsHash.put(31 * ((FunctionImpl) node).getParameters().stream()
					  .map(param -> {
						  return param.getType().hashCode();
					  })
					  .collect(Collectors.toList())
					  .hashCode() + ((FunctionImpl) node).getFunctionName().hashCode(), (FunctionImpl) node);
		}
	}
}
