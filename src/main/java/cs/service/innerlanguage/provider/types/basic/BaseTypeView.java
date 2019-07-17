/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types.basic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"classPath", "className", "parent", "instanceable", "injecting", "constructors", "staticMethods", "methods"})
public class BaseTypeView {
	private String classPath;
	private String className;
	private String parent;
	private Boolean instanceable;
	private Boolean injecting;
	private List<BaseMethodView> constructors;
	private List<BaseMethodView> staticMethods;
	private List<BaseMethodView> methods;

	public BaseTypeView() {
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}

	public List<BaseMethodView> getConstructors() {
		return constructors;
	}

	public void setConstructors(List<BaseMethodView> constructors) {
		this.constructors = constructors;
	}

	public Boolean getInjecting() {
		return injecting;
	}

	public void setInjecting(Boolean injecting) {
		this.injecting = injecting;
	}

	public Boolean getInstanceable() {
		return instanceable;
	}

	public List<BaseMethodView> getMethods() {
		return methods;
	}

	public void setMethods(List<BaseMethodView> methods) {
		this.methods = methods;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public List<BaseMethodView> getStaticMethods() {
		return staticMethods;
	}

	public void setStaticMethods(List<BaseMethodView> staticMethods) {
		this.staticMethods = staticMethods;
	}
}
