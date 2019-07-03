/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types.basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import cs.service.innerlanguage.translator.types.TypeWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anisimov_a_v
 */
public final class BasicProvider {
	private static final String TYPEPATH = "types";
	private static BasicProvider instance;
	private Map<String, TypeWrapper> typesByName;
	private Map<String, TypeWrapper> typesByClassName;

	private BasicProvider() {
		reload();
	}

	public static BasicProvider instance() {
		if (instance == null) {
			synchronized (BasicProvider.class) {
				if (instance == null) {
					instance = new BasicProvider();
				}
			}
		}
		return instance;
	}

	public TypeWrapper getTypesByClassName(String className) {
		return typesByClassName.get(className);
	}

	public TypeWrapper getTypesByName(String name) {
		return typesByName.get(name);
	}

	public Map<String, TypeWrapper> getTypesByName() {
		return typesByName;
	}

	public Map<String, TypeWrapper> getTypesByClassName() {
		return typesByClassName;
	}

	public void reload() {
		this.typesByName = new HashMap();
		this.typesByClassName = new HashMap();
		try {
			for (String name : getResourceFiles(TYPEPATH)) {
				ObjectMapper mapper = new ObjectMapper();
				TypesTreeView view = mapper.readValue(getContextClassLoader().getResourceAsStream(TYPEPATH + File.separator + name), TypesTreeView.class);
				visit(view);
			}
			typesByClassName.entrySet()
					  .stream()
					  .map(entry -> entry.getValue())
					  .forEach(type -> {
						  type.initMethods(typesByClassName);
					  });
		} catch (IOException ex) {
			Logger.getLogger(BasicProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void visit(TypesTreeView tree) {
		BaseTypeView typeView = tree.getTypeNode();
		TypeWrapper type = new TypeWrapper(typeView,
													  typesByClassName.containsKey(typeView.getParent())
													  ? typesByClassName.get(typeView.getParent())
													  : null);
		typesByName.put(type.getClassName(), type);
		typesByClassName.put(type.getClassPath(), type);
		if (tree.getInnerTypes() != null) {
			tree.getInnerTypes().forEach(inner -> {
				visit(inner);
			});
		}
	}

	private List<String> getResourceFiles(String path) throws IOException {
		List<String> filenames = new ArrayList<>();
		try (
				  InputStream in = getResourceAsStream(path);
				  BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			String resource;
			while ((resource = br.readLine()) != null) {
				filenames.add(resource);
			}
		}
		return filenames;
	}

	private InputStream getResourceAsStream(String resource) {
		final InputStream in
								= getContextClassLoader().getResourceAsStream(resource);
		return in == null ? getClass().getResourceAsStream(resource) : in;
	}

	private ClassLoader getContextClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}
}
