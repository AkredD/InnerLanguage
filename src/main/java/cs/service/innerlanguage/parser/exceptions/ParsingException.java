/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.parser.exceptions;

/**
 *
 * @author anisimov_a_v
 */
public class ParsingException extends InnerException {
	public ParsingException() {
	}

	public ParsingException(String message) {
		super(message);
	}

	public ParsingException(String message, Throwable cause) {
		super(message, cause);
	}
}
