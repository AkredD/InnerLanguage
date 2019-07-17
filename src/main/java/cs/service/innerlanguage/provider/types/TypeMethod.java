/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types;

import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.provider.types.basic.BaseMethodView;
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

	public TypeMethod(BaseMethodView methodView) {
		this.output = (MainProvider.instance().containsClassName(methodView.getOutputClassName()))
						  ? MainProvider.instance().getTypeByClassName(methodView.getOutputClassName())
						  : MainProvider.instance().registerType(methodView.getOutputClassName());
		this.methodName = methodView.getMethodName();
		this.constructor = new TypeConstructor(methodView.getConstructor());
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
