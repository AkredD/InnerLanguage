/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types.basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.ExecutionException;
import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.translator.context.TypeImpl;
import cs.service.innerlanguage.provider.types.NullTypeWrapper;
import cs.service.innerlanguage.provider.types.TypeConstructor;
import cs.service.innerlanguage.provider.types.TypeMethod;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.utils.Pair;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;
import cs.service.innerlanguage.provider.IProvider;

/**
 *
 * @author anisimov_a_v
 */
public final class BasicProvider implements IProvider {
	private static final String TYPEPATH = "types";
	private static final String DEFAULT_CLASS_PATH = "cs.service.registerTypes";
	private Map<String, TypeWrapper> typesByName;
	private Map<String, TypeWrapper> typesByClassName;
	private List<TypeWrapper> customTypes;
	private MainProvider mainProvaider;

	public BasicProvider(MainProvider mainProvaider) {
		this.mainProvaider = mainProvaider;
		customTypes = new ArrayList();
	}

	@Override
	public TypeWrapper getTypeByClassName(String className) {
		return typesByClassName.get(className);
	}

	@Override
	public TypeWrapper getTypeByName(String name) {
		return typesByName.get(name);
	}

	/**
	 *
	 * @return
	 */
	@Override
	public Map<String, TypeWrapper> getTypesByName() {
		return typesByName;
	}

	@Override
	public Map<String, TypeWrapper> getTypesByClassName() {
		return typesByClassName;
	}

	public void registerType(TypeImpl type) {
		if (typesByName.containsKey(type.getTypeName())) {
			mainProvaider.handleException(ExceptionMessage.TYPE_ALREADY_EXISTS, type.getStart(), type.getTypeName());
		}
		List<TypeMethod> methods = type.getFunctions().stream()
				  .map(foo -> {
					  TypeConstructor constructor = new TypeConstructor((foo.getParameters() == null)
																						 ? null
																						 : foo.getParameters().stream()
											.map(param -> {
												return new Pair<>(param.getType(), param.getDataName());
											})
											.collect(Collectors.toList()));
					  TypeMethod method = new TypeMethod(foo.getType(), foo.getFunctionName(), false, constructor);
					  return method;
				  })
				  .collect(Collectors.toList());
		TypeWrapper customType = new TypeWrapper(DEFAULT_CLASS_PATH + "." + type.getTypeName(), type.getTypeName(), Arrays.asList(type.getParentType()), Boolean.TRUE, Boolean.FALSE, methods, null, null);
		customTypes.add(customType);
		typesByName.put(customType.getClassName(), customType);
		typesByClassName.put(customType.getClassPath(), customType);
	}

	@Override
	public void reload() {
		this.typesByName = new HashMap();
		this.typesByClassName = new HashMap();
		customTypes.forEach(type -> {
			typesByName.put(type.getClassName(), type);
			typesByClassName.put(type.getClassPath(), type);
		});
		try {
			for (String name : mainProvaider.getResourceFiles(TYPEPATH)) {
				ObjectMapper mapper = new ObjectMapper();
				TypesTreeView view = mapper.readValue(mainProvaider.getContextClassLoader().getResourceAsStream(TYPEPATH + File.separator + name), TypesTreeView.class);
				visit(view);
			}
			typesByClassName.entrySet()
					  .stream()
					  .map(entry -> entry.getValue())
					  .forEach(type -> {
						  type.initMethods();
					  });
		} catch (IOException ex) {
			Logger.getLogger(BasicProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void visit(TypesTreeView tree) {
		BaseTypeView typeView = tree.getTypeNode();
		TypeWrapper type = new TypeWrapper(typeView,
													  typesByClassName.containsKey(typeView.getParent())
													  ? Arrays.asList(typesByClassName.get(typeView.getParent()))
													  : null);
		typesByName.put(type.getClassName(), type);
		typesByClassName.put(type.getClassPath(), type);
		if (tree.getInnerTypes() != null) {
			tree.getInnerTypes().forEach(inner -> {
				visit(inner);
			});
		}
	}
}
