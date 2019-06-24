/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.parser.exceptions;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author admin
 */
public enum ExceptionMessage {
	AMBIGUOUS_ATTRIBUTE,
	MISMATCH_INPUT,
	NOT_ENOUGH_RIGHTS,
	NO_SUCH_TABLE,
	UNKNOWN_COLUMN;
	private static final String MESSAGES = "messages";
	private static final ResourceBundle MSG_BUNDLE = ResourceBundle.getBundle(MESSAGES, Locale.getDefault());
        

	public String getLocalizedMessage() {
		return MSG_BUNDLE.getString(this.toString());
	}
}
