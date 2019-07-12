/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types;

import cs.service.innerlanguage.translator.types.basic.BaseMethodView;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public class TypeMethod {
	private final TypeWrapper output;
	private final String methodName;
	private final boolean primitive;
	private final TypeConstructor constructor;

	public TypeMethod(TypeWrapper output, String methodName, Boolean primitive, TypeConstructor constructor) {
		this.output = output;
		this.constructor = constructor;
		this.methodName = methodName;
		this.primitive = primitive;
	}

	public TypeMethod(BaseMethodView methodView, Map<String, TypeWrapper> typesByClassName) {
		this.output = (typesByClassName.containsKey(methodView.getOutputClassName())) ? typesByClassName.get(methodView.getOutputClassName()) : null;
		this.methodName = methodView.getMethodName();
		this.constructor = new TypeConstructor(methodView.getConstructor(), typesByClassName);
		this.primitive = methodView.isPrimitive();
	}

	public TypeConstructor getConstructor() {
		return constructor;
	}

	public String getMethodName() {
		return methodName;
	}

	public TypeWrapper getOutput() {
		return output;
	}

	public boolean isPrimitive() {
		return primitive;
	}
}
