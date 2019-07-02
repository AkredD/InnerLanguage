/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types.basic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"classPath", "className", "parent", "methods"})
public class BaseTypeView {
	private String classPath;
	private String className;
	private String parent;
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
}
