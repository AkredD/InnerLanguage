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
	METHODS_DOESNT_EXISTS,
	WRONG_CALL_OBJECT_METHOD,
	NO_COLLABLE_STATIC_METHODS,
	NO_COLLABLE_METHODS,
	VARIABLE_DOESNT_EXISTS,
	TYPE_CAST_EXCEPTION,
	CANT_PARSE_VARVALUE,
	BAD_UNARY_OPERATOR_TYPE,
	INCOMPATIBLE_TYPES,
	BAD_OPERATOR_TYPES,
	NO_SUITABLE_METHOD_FOUND,
	NO_SUITABLE_CONSTRUCTORS_FOUND,
	TYPE_HAS_NO_STATIC_METHODS_WITH_THIS_NAME,
	TYPE_HAS_NO_METHODS_WITH_THIS_NAME,
	NAME_ALREADY_IN_USE,
	DUPLICATE_FUNCTION_NAME,
	MISS_RETURN_STATEMENT,
	UNREACHABLE_STATEMENT,
	WRONG_RETURN_TYPE,
	ENDPOINT_OUT_OF_CONTEXT,
	OPERATOR_DOESNT_SUPPORT_TYPE,
	FUNCTION_DOESNT_EXISTS,
	TYPE_ALREADY_EXISTS,
	VARARGS_DOESNT_SUPPORT,
	PRIMITVE_ARRAYS_DOESNT_SUPPORT,
	RUNTIME_TYPE_LOAD_EXCEPTION,
	THIS_TYPE_CANT_BE_A_SYSTEM;
	private static final String MESSAGES = "messages";
	private static final ResourceBundle MSG_BUNDLE = ResourceBundle.getBundle(MESSAGES, Locale.getDefault());

	public String getLocalizedMessage() {
		return MSG_BUNDLE.getString(this.toString());
	}
}
