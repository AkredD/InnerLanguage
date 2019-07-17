/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider;

import cs.service.innerlanguage.provider.types.TypeWrapper;
import java.util.Map;

/**
 *
 * @author anisimov_a_v
 */
public interface IProvider {
	public TypeWrapper getTypeByClassName(String className);

	public Map<String, TypeWrapper> getTypesByClassName();

	public TypeWrapper getTypeByName(String name);

	public Map<String, TypeWrapper> getTypesByName();

	public void reload();
}
