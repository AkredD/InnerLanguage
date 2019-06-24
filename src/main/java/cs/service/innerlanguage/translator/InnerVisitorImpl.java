/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator;

import cs.service.innerlanguage.parser.InnerParser;
import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.BreakImpl;
import cs.service.innerlanguage.translator.context.CallFunctionImpl;
import cs.service.innerlanguage.translator.context.ConstantDefinitionImpl;
import cs.service.innerlanguage.translator.context.ContinueImpl;
import cs.service.innerlanguage.translator.context.DataDefinitionImpl;
import cs.service.innerlanguage.translator.context.DataStatement;
import cs.service.innerlanguage.translator.context.EqImpl;
import cs.service.innerlanguage.translator.context.ExpressionContext;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.MinusEqImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.context.ParameterImpl;
import cs.service.innerlanguage.translator.context.PlusEqImpl;
import cs.service.innerlanguage.translator.context.ReturnImpl;
import cs.service.innerlanguage.translator.context.StatementContext;
import cs.service.innerlanguage.translator.context.SystemDefinitionImpl;
import cs.service.innerlanguage.translator.context.TypeImpl;
import cs.service.innerlanguage.translator.context.UnaryConditionImpl;
import cs.service.innerlanguage.translator.context.WriteStatementImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author root
 */
public class InnerVisitorImpl extends InnerBaseVisitor<NodeContext> {
    
     /**
      * Start method
     * Get the main object for next translation
     *
     * @param ctx 
     * @return the value of NodeContext
     */
    @Override
    public NodeContext visitInner(InnerParser.InnerContext ctx) {
        return super.visitInner(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of DataStatement
     *
     * @param ctx 
     * @return the value of DataStatement
     */
    @Override
    public NodeContext visitVarDefinition(InnerParser.VarDefinitionContext ctx) {
        return super.visitVarDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * Get the value of System variable definition
     *
     * @param ctx 
     * @return the value of SystemDefinitionImpl
     */
    @Override
    public NodeContext visitSystemDef(InnerParser.SystemDefContext ctx) {
        return new SystemDefinitionImpl(null, ctx.TYPENAME().getText(), ctx.DATANAME().getText());
    }

    
    /**
     * Get the value of constant variable definition
     *
     * @param ctx 
     * @return the value of ConstantDefinitionImpl
     */
    @Override
    public NodeContext visitConstantDef(InnerParser.ConstantDefContext ctx) {
        List<NodeContext> values = null;
        ConstantDefinitionImpl definition = new ConstantDefinitionImpl(null, ctx.TYPENAME().getText(), ctx.DATANAME().getText(), null);
        if (ctx.varValue() != null) {
            values = ctx.varValue().stream()
                    .map(valueCtx -> {
                       NodeContext node = valueCtx.accept(this);
                       if (AbstractNodeContext.class.isAssignableFrom(node.getClass())){
                           ((AbstractNodeContext) node).setParent(definition);
                       }
                       return node;
                    })
                    .collect(Collectors.toList());
        }
        definition.setValues(values);
        return definition;
    }

    /**
     * Get the value of variable definition
     *
     * @param ctx 
     * @return the value of ConstantDefinitionImpl
     */
    @Override
    public NodeContext visitDataDef(InnerParser.DataDefContext ctx) {
        List<NodeContext> values = null;
        DataDefinitionImpl definition = new DataDefinitionImpl(null, ctx.TYPENAME().getText(), ctx.DATANAME().getText(), null);
        if (ctx.varValue() != null) {
            values = ctx.varValue().stream()
                    .map(valueCtx -> {
                       NodeContext node = valueCtx.accept(this);
                       if (AbstractNodeContext.class.isAssignableFrom(node.getClass())){
                           ((AbstractNodeContext) node).setParent(definition);
                       }
                       return node;
                    })
                    .collect(Collectors.toList());
        }
        definition.setValues(values);
        return definition;
    }

    /**
     * Get the value of new type
     *
     * @param ctx 
     * @return the value of TypeImpl
     */
    @Override
    public NodeContext visitType(InnerParser.TypeContext ctx) {
        List<DataStatement> staticBlock = null;
        List<FunctionImpl> functions = null;
        TypeImpl type = new TypeImpl(null, ctx.TYPENAME().getText(), null, null);
        if (ctx.staticBlock() != null) {
            staticBlock = ctx.staticBlock().varDefinition()
                    .stream()
                    .map(varCtx -> {
                        DataStatement dataStatement = (DataStatement) varCtx.accept(this);
                        dataStatement.setParent(type);
                        return dataStatement;
                    })
                    .collect(Collectors.toList());
        }
        if (ctx.function() != null) {
            functions = ctx.function().stream()
                    .map(fooCtx -> {
                        FunctionImpl foo = (FunctionImpl) fooCtx.accept(this);
                        foo.setParent(type);
                        return foo;
                    })
                    .collect(Collectors.toList());
        }
        type.setStaticBlock(staticBlock);
        type.setFunctions(functions);
        return type;
    }

    /**
     * Get the value of type static block
     * do not usage
     * @param ctx 
     * @return the value of data definition
     */
    @Deprecated
    @Override
    public NodeContext visitStaticBlock(InnerParser.StaticBlockContext ctx) {
        return super.visitStaticBlock(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of type function
     * 
     * @param ctx 
     * @return the value of FunctionImpl
     */
    @Override
    public NodeContext visitFunction(InnerParser.FunctionContext ctx) {
        // TYPENAME(0) - function type name, DATANAME(0) - function name
        FunctionImpl foo = new FunctionImpl(null, ctx.TYPENAME(0).getText(), ctx.DATANAME(0).getText(), null, null);
        List<ParameterImpl> parameters = new ArrayList();
        List<StatementContext> statements = null;
        for (int i = 1; i < ctx.TYPENAME().size(); ++i) {
            parameters.add(new ParameterImpl(foo, ctx.TYPENAME(i).getText(), ctx.DATANAME(i).getText()));
        }
        if (ctx.statement() != null) {
            statements = ctx.statement().stream()
                    .map(stCtx -> {
                        StatementContext st = (StatementContext) stCtx.accept(this);
                        st.setParent(foo);
                        return st;
                    })
                    .collect(Collectors.toList());
        }
        foo.setParameters(parameters);
        foo.setInnerStatements(statements);
        return super.visitFunction(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of type statement
     * do not usage
     * @param ctx 
     * @return the value of StatementContext
     */
    @Deprecated
    @Override
    public NodeContext visitStatement(InnerParser.StatementContext ctx) {
        return super.visitStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of type function
     * 
     * @param ctx 
     * @return the value of FunctionImpl
     */
    @Override
    public NodeContext visitWriteStatement(InnerParser.WriteStatementContext ctx) {
        WriteStatementImpl st = new WriteStatementImpl(null, null);
        List<NodeContext> values = null;
        if (ctx.varValue() != null) {
            values = ctx.varValue().stream()
                    .map(valueCtx -> {
                       NodeContext node = valueCtx.accept(this);
                       if (AbstractNodeContext.class.isAssignableFrom(node.getClass())){
                           ((AbstractNodeContext) node).setParent(st);
                       }
                       return node;
                    })
                    .collect(Collectors.toList());
        }
        st.setValues(values);
        return st;
    }

    
    @Override
    public NodeContext visitCallStatement(InnerParser.CallStatementContext ctx) {
        CallFunctionImpl callFoo = new CallFunctionImpl(null, ctx.TYPENAME().getText(), ctx.DATANAME().getText(), null);
        List<NodeContext> values = null;
        if (ctx.varValue() != null) {
            values = ctx.varValue().stream()
                    .map(valueCtx -> {
                       NodeContext node = valueCtx.accept(this);
                       if (AbstractNodeContext.class.isAssignableFrom(node.getClass())){
                           ((AbstractNodeContext) node).setParent(callFoo);
                       }
                       return node;
                    })
                    .collect(Collectors.toList());
        }
        callFoo.setValues(values);
        return callFoo;
    }

    @Override
    public NodeContext visitBreakStatement(InnerParser.BreakStatementContext ctx) {
        return new BreakImpl(null);
    }

    @Override
    public NodeContext visitContinueStatement(InnerParser.ContinueStatementContext ctx) {
        return new ContinueImpl(null);
    }

    @Override
    public NodeContext visitReturnStatement(InnerParser.ReturnStatementContext ctx) {
        ReturnImpl returnStatement = new ReturnImpl(null, null);
        NodeContext value = ctx.varValue().accept(this);
        if (AbstractNodeContext.class.isAssignableFrom(value.getClass())){
            ((AbstractNodeContext) value).setParent(returnStatement);
        }
        return returnStatement;
    }

    @Override
    public NodeContext visitMinusEqStatemet(InnerParser.MinusEqStatemetContext ctx) {
        MinusEqImpl minusStatement = new MinusEqImpl(null, null);
        NodeContext value = ctx.varValue().accept(this);
        if (AbstractNodeContext.class.isAssignableFrom(value.getClass())){
            ((AbstractNodeContext) value).setParent(minusStatement);
        }
        return minusStatement;
    }

    @Override
    public NodeContext visitPlusEqStatemet(InnerParser.PlusEqStatemetContext ctx) {
        PlusEqImpl plusEqStatement = new PlusEqImpl(null, null);
        NodeContext value = ctx.varValue().accept(this);
        if (AbstractNodeContext.class.isAssignableFrom(value.getClass())){
            ((AbstractNodeContext) value).setParent(plusEqStatement);
        }
        return plusEqStatement;
    }

    @Override
    public NodeContext visitEqStatement(InnerParser.EqStatementContext ctx) {
        EqImpl eqStatement = new EqImpl(null, null);
        NodeContext value = ctx.varValue().accept(this);
        if (AbstractNodeContext.class.isAssignableFrom(value.getClass())){
            ((AbstractNodeContext) value).setParent(eqStatement);
        }
        return eqStatement;
    }

    @Override
    public NodeContext visitWhileStatement(InnerParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeContext visitIfStatement(InnerParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeContext visitExpression(InnerParser.ExpressionContext ctx) {
        return super.visitExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeContext visitBoolExpression(InnerParser.BoolExpressionContext ctx) {
        return super.visitBoolExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeContext visitCondition(InnerParser.ConditionContext ctx) {
        if (ctx.OPENBRACKET() != null) {
            ExpressionContext expCtx = new ExpressionContext(null, true, null);
            NodeContext inner = ctx.condition().get(0).accept(this);
            if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())){
                ((AbstractNodeContext) inner).setParent(expCtx);
            }
            expCtx.setInner(inner);
            return expCtx;
        }
        if (ctx.CONDITIONUNARYPERATOR() != null) {
            UnaryConditionImpl unary = new UnaryConditionImpl(null, null, ctx.CONDITIONUNARYPERATOR().getText());
            NodeContext inner = ctx.condition().get(0).accept(this);
            if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())){
                ((AbstractNodeContext) inner).setParent(unary);
            }
            unary.setOperand(inner);
            return unary;
        } 
        
        return super.visitCondition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeContext visitVarValue(InnerParser.VarValueContext ctx) {
        return super.visitVarValue(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected NodeContext aggregateResult(NodeContext aggregate, NodeContext nextResult) {
        return super.aggregateResult(aggregate, nextResult); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
    
}
