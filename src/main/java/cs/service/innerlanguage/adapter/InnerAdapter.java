/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.adapter;

import cs.service.innerlanguage.inspector.InspectManager;
import cs.service.innerlanguage.parser.InnerLexer;
import cs.service.innerlanguage.parser.InnerParser;
import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.InnerException;
import cs.service.innerlanguage.parser.exceptions.ParsingException;
import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.translator.InnerBaseVisitor;
import cs.service.innerlanguage.translator.InnerVisitor;
import cs.service.innerlanguage.translator.InnerVisitorImpl;
import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.context.TypeImpl;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author anisimov_a_v
 */
public class InnerAdapter {
	private Integer a = new Integer(32);
	private Integer b = new Integer(a);

	public int[] someMethod(String aa, char aaaa) {
		return new int[] {1};
	}

	public int someMethod2(InnerAdapter[] d) {
		return 1;
	}

	public static void main(String[] args) {
		//showBasicTypes();
		MainProvider.instance().ignorePrimitiveArrays(Boolean.TRUE).ignoreVarargs(Boolean.TRUE).reload();
		MainProvider.instance().getRuntimeTypesByName().values().forEach(type -> {
			type.getAllMethods();
			type.getAllStaticMethods();
		});
		Class clazz = null;
		try {
			//showBasicTypes();
			clazz = Class.forName("cs.service.innerlanguage.inspector.AbstractInspector");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(InnerAdapter.class.getName()).log(Level.SEVERE, null, ex);
		}
		clazz.getMethods();
		clazz.getDeclaredAnnotations();
		clazz.getDeclaredMethods();
		String a = null;
		try {
			a = IOUtils.toString(Thread.currentThread().getContextClassLoader().getResourceAsStream("examples" + File.separator + "main"), "UTF-8");
		} catch (IOException ex) {
			Logger.getLogger(InnerAdapter.class.getName()).log(Level.SEVERE, null, ex);
		}
		InnerParser.InnerContext context = prepareContext(a);
	}

	private static void showBasicTypes() {
		MainProvider.instance().getBasicTypesByName()
				  .entrySet()
				  .stream()
				  .forEach(typeEntry -> {
					  System.out.println("---------------------------------------");
					  System.out.println(typeEntry.getKey() + " parent - "
												+ ((typeEntry.getValue().getParentList() == null) ? "null" : typeEntry.getValue().getParentList()
											.stream()
											.map(parent -> {
												return parent.getClassName();
											})
											.collect(Collectors.joining(", "))));
					  typeEntry.getValue().getConstructors().forEach(costr -> {
						  System.out.println("constructors  ("
													+ costr.getConstructor().getParameters()
									 .stream()
									 .map(constr -> {
										 return constr.getKey().getClassName() + " " + constr.getValue();
									 })
									 .collect(Collectors.joining(", ")) + " )");
					  });
					  System.out.println("----");
					  typeEntry.getValue().getStaticMethods().forEach(stMethod -> {
						  System.out.println("static methods " + stMethod.getMethodName() + " ("
													+ stMethod.getConstructor().getParameters()
									 .stream()
									 .map(constr -> {
										 return constr.getKey().getClassName() + " " + constr.getValue();
									 })
									 .collect(Collectors.joining(", ")) + " )");
					  });
					  System.out.println("----");
					  typeEntry.getValue().getAllMethods().forEach(method -> {
						  System.out.println("method " + method.getMethodName() + " ("
													+ method.getConstructor().getParameters()
									 .stream()
									 .map(constr -> {
										 return constr.getKey().getClassName() + " " + constr.getValue();
									 })
									 .collect(Collectors.joining(", ")) + ")");
					  });
				  });
	}

	private static InnerParser.InnerContext prepareContext(String csdmlQuery) {
		ANTLRInputStream input = new ANTLRInputStream(csdmlQuery);
		InnerLexer lexer = new InnerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		InnerParser parser = new InnerParser(tokens);
		InnerVisitor<NodeContext> visitor = new InnerVisitorImpl();
		parser.setErrorHandler(new BailErrorStrategy());
		InnerParser.InnerContext scriptCtx;
		try {
			scriptCtx = parser.inner();
			Object obj = visitor.visit(scriptCtx);
			InspectManager manager = new InspectManager();
			manager.inspectType((TypeImpl) obj);
			//System.out.println(csdmlQuery);
			System.out.println("\n\n----------------------------------------------------------------------\n\n");
			System.out.println(((AbstractNodeContext) obj).getPosition());
			System.out.println(obj.toString());
		} catch (ParseCancellationException ex) {
			Throwable cause = ex.getCause();
			String message;
			if (cause instanceof RecognitionException) {
				Token token = ((RecognitionException) cause).getOffendingToken();
				System.out.println(((RecognitionException) cause).getCtx().getText());
				message = String.format(ExceptionMessage.MISMATCH_INPUT.getLocalizedMessage(),
												new Object[] {token.getLine(),
																  token.getStartIndex() - tokens.get(token.getTokenIndex() - 1).getStopIndex(),
																  token.getText(),
																  ((RecognitionException) cause).getExpectedTokens().toList().stream()
																  .map(tokenId -> {
																	  System.out.println(tokenId);
																	  return lexer.getVocabulary().getDisplayName(tokenId);
																  })
																  .collect(Collectors.joining(" "))});
			} else {
				message = ex.getMessage();
			}
			throw new ParsingException(message);
		}
		return scriptCtx;
	}
}
