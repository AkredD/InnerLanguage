/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.parser.exceptions;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author anisimov_a_v
 */
public enum ExceptionMessage {
	CANT_PARSE_DATE,
	MISMATCH_INPUT,
	TYPE_NOT_EXIST,
	METHODS_DOESNT_EXISTS;
	private static final String MESSAGES = "messages";
	private static final ResourceBundle MSG_BUNDLE = ResourceBundle.getBundle(MESSAGES, Locale.getDefault());

	public String getLocalizedMessage() {
		return MSG_BUNDLE.getString(this.toString());
	}
}
