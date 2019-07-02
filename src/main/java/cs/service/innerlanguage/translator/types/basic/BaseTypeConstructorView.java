/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types.basic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Map;

/**
 *
 * @author anisimov_a_v
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"parameters"})
public class BaseTypeConstructorView {
	private Map<String, String> parameters;

	public BaseTypeConstructorView() {
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
}
