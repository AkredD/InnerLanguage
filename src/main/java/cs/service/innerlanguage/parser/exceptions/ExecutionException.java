/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.parser.exceptions;

/**
 *
 * @author alex
 */
public class ExecutionException extends InnerException {
	private final int line;
	private final int pos;

	public ExecutionException(String msg, int line, int pos) {
		super(msg);
		this.line = line;
		this.pos = pos;
	}

	public int getLine() {
		return line;
	}

	@Override
	public String getMessage() {
		StringBuilder msgBuilder = new StringBuilder(super.getMessage());
		msgBuilder.append(" (").append(line).append(":")
				  .append(pos).append(")");
		return msgBuilder.toString();
	}
}
