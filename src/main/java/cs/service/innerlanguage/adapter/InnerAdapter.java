/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.adapter;

import cs.service.innerlanguage.parser.InnerLexer;
import cs.service.innerlanguage.parser.InnerParser;
import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.ParsingException;
import cs.service.innerlanguage.translator.InnerBaseVisitor;
import cs.service.innerlanguage.translator.InnerVisitor;
import cs.service.innerlanguage.translator.InnerVisitorImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.types.basic.BasicProvider;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author anisimov_a_v
 */
public class InnerAdapter {
	private static String query = "TYPE Main.\n"
											+ "STATIC (\n"
											+ "DATA: Integer a VALUES(123)\n"
											+ ".\n"
											+ "CONSTANT: Integer b VALUES(412, 312).\n"
											+ "SYSTEM: BaseObject bo.\n"
											+ ")\n"
											+ "\n"
											+ "FUNCTION Void main () \n"
											+ "START.\n"
											+ "if (a == TRUE AND FALSE)\n"
											+ "START.\n"
											+ "return a.\n"
											+ "END.\n"
											+ "ELSE\n"
											+ "START.\n"
											+ "return a. return a.\n"
											+ "END.\n"
											+ "data: Integer i values (asd).\n"
											+ "while (i > 0)\n"
											+ "START.\n"
											+ "continue.\n"
											+ "END.\n"
											+ "return i.\n"
											+ "END. \n"
											+ "FUNCTION String getString () \n"
											+ "START.\n"
											+ "if (a == TRUE AND FALSE)\n"
											+ "START.\n"
											+ "return a.\n"
											+ "END.\n"
											+ "ELSE\n"
											+ "START.\n"
											+ "return a. return a.\n"
											+ "END.\n"
											+ "data: Integer i values (asd).\n"
											+ "while (i > 0)\n"
											+ "START.\n"
											+ "continue.\n"
											+ "END.\n"
											+ "return i.\n"
											+ "END. \n"
											+ "END.";

	public static void main(String[] args) {
		BasicProvider.instance();
		BasicProvider.instance().getTypesByName()
				  .entrySet()
				  .stream()
				  .forEach(typeEntry -> {
					  System.out.println("-------------");
					  System.out.println(typeEntry.getKey() + " parent - "
												+ ((typeEntry.getValue().getParent() == null) ? "null" :typeEntry.getValue().getParent().getClassName()));
					  /*typeEntry.getValue().getMethods().forEach(method -> {
						  System.out.println("method " + method.getMethodName() + " ("
													+ method.getConstructor().getParameters()
									 .stream()
									 .map(constr -> {
										 return constr.getKey().getClassName() + " " + constr.getValue();
									 })
									 .collect(Collectors.joining(", ")) + " )");
					  });*/
				  });
		//InnerParser.InnerContext context = prepareContext(query);
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
			//System.out.println(csdmlQuery);
			System.out.println("\n\n----------------------------------------------------------------------\n\n");
			System.out.println(obj.toString());
		} catch (ParseCancellationException ex) {
			Throwable cause = ex.getCause();
			String message;
			if (cause instanceof RecognitionException) {
				Token token = ((RecognitionException) cause).getOffendingToken();
				message = String.format(ExceptionMessage.MISMATCH_INPUT.getLocalizedMessage(),
												new Object[] {token.getLine(), token.getStartIndex(), token.getText()});
			} else {
				message = ex.getMessage();
			}
			throw new ParsingException(message);
		}
		return scriptCtx;
	}
}
