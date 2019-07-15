/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types.basic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"outputClassName", "methodName", "primitive", "constructor"})
public class BaseMethodView {
	private String outputClassName;
	private String methodName;
	private boolean primitive;
	private BaseTypeConstructorView constructor;

	public BaseMethodView() {
	}

	public BaseTypeConstructorView getConstructor() {
		return constructor;
	}

	public void setConstructor(BaseTypeConstructorView constructor) {
		this.constructor = constructor;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getOutputClassName() {
		return outputClassName;
	}

	public void setOutputClassName(String outputClassName) {
		this.outputClassName = outputClassName;
	}

	public boolean isPrimitive() {
		return primitive;
	}

	public void setPrimitive(boolean primitive) {
		this.primitive = primitive;
	}
}
