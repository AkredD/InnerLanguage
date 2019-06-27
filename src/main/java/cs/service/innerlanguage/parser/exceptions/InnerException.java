/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.parser.exceptions;

/**
 *
 * @author anisimov_a_v
 */
public class InnerException extends RuntimeException {
	public InnerException() {
	}

	public InnerException(String message) {
		super(message);
	}

	public InnerException(String message, Throwable cause) {
		super(message, cause);
	}
}
