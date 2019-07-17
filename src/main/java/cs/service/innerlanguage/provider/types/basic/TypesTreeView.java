/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types.basic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"typeNode", "innerTypes"})
public class TypesTreeView {
	private BaseTypeView typeNode;
	private List<TypesTreeView> innerTypes;

	public TypesTreeView() {
	}

	public List<TypesTreeView> getInnerTypes() {
		return innerTypes;
	}

	public void setInnerTypes(List<TypesTreeView> innerTypes) {
		this.innerTypes = innerTypes;
	}

	public BaseTypeView getTypeNode() {
		return typeNode;
	}

	public void setTypeNode(BaseTypeView typeNode) {
		this.typeNode = typeNode;
	}
}
