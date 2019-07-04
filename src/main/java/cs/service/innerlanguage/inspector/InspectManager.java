/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.ExecutionException;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.TypeImpl;
import cs.service.innerlanguage.translator.statements.DataStatement;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class InspectManager {
	private Map<String, FunctionImpl> functionContext;
	private Map<String, DataStatement> variableContext;

	public void inspectType(TypeImpl type) {
		if (type.getFunctions() == null || type.getFunctions().isEmpty()) {
			handleException(ExceptionMessage.METHODS_DOESNT_EXISTS, type.getTypeName(), type.getStart());
		}
		functionContext = type.getFunctions()
				  .stream()
				  .collect(Collectors.toMap(fun -> {
					  return fun.getFunctionName();
				  }, fun -> {
											  return fun;
										  }));
	}

	private void handleException(ExceptionMessage cause, String details, Token start) {
		String message = String.format(cause.getLocalizedMessage(), details);
		throw new ExecutionException(message, start.getLine(), start.getCharPositionInLine());
	}
}
