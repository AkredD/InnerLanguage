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
	private static InnerAdapter instance;
	private String packageFolder = "ru.ntik.cs.actions.translated";

	private InnerAdapter() {
		MainProvider.instance().ignorePrimitiveArrays(Boolean.TRUE).ignoreVarargs(Boolean.TRUE).reload();
	}

	public static InnerAdapter instance() {
		if (instance == null) {
			synchronized (MainProvider.class) {
				if (instance == null) {
					instance = new InnerAdapter();
				}
			}
		}
		return instance;
	}

	public String translate(String sourceCode) {
		return prepareContext(sourceCode).toString();
	}

	public static void main(String[] args) {
		MainProvider.instance().ignorePrimitiveArrays(Boolean.TRUE).ignoreVarargs(Boolean.TRUE).reload();
		String a = null;
		try {
			a = IOUtils.toString(Thread.currentThread().getContextClassLoader().getResourceAsStream("examples" + File.separator + "main"), "UTF-8");
		} catch (IOException ex) {
			Logger.getLogger(InnerAdapter.class.getName()).log(Level.SEVERE, null, ex);
		}
		NodeContext context = prepareContext(a);
		System.out.println(context.toString());
	}

	private static NodeContext prepareContext(String csdmlQuery) {
		NodeContext obj = null;
		ANTLRInputStream input = new ANTLRInputStream(csdmlQuery);
		InnerLexer lexer = new InnerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		InnerParser parser = new InnerParser(tokens);
		InnerVisitor<NodeContext> visitor = new InnerVisitorImpl();
		parser.setErrorHandler(new BailErrorStrategy());
		InnerParser.InnerContext scriptCtx;
		try {
			scriptCtx = parser.inner();
			obj = visitor.visit(scriptCtx);
			InspectManager manager = new InspectManager();
			manager.inspectType((TypeImpl) obj);
		} catch (ParseCancellationException ex) {
			Throwable cause = ex.getCause();
			String message;
			if (cause instanceof RecognitionException) {
				Token token = ((RecognitionException) cause).getOffendingToken();
				message = String.format(ExceptionMessage.MISMATCH_INPUT.getLocalizedMessage(),
												new Object[] {token.getLine(),
																  token.getStartIndex() - tokens.get(token.getTokenIndex() - 1).getStopIndex(),
																  token.getText(),
																  ((RecognitionException) cause).getExpectedTokens().toList().stream()
																  .map(tokenId -> {
																	  return lexer.getVocabulary().getDisplayName(tokenId);
																  })
																  .collect(Collectors.joining(" "))});
			} else {
				message = ex.getMessage();
			}
			throw new ParsingException(message);
		}
		return obj;
	}

	public String getPackageFolder() {
		return packageFolder;
	}

	public void setPackageFolder(String packageFolder) {
		this.packageFolder = packageFolder;
	}
}
