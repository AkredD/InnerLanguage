/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.ExecutionException;
import cs.service.innerlanguage.parser.exceptions.PreparationException;
import cs.service.innerlanguage.provider.types.NullTypeWrapper;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.provider.types.basic.BasicProvider;
import cs.service.innerlanguage.provider.types.runtime.RuntimeProvider;
import cs.service.innerlanguage.translator.context.TypeImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;
import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

/**
 *
 * @author anisimov_a_v
 */
public class MainProvider {
	private static MainProvider instance;
	private BasicProvider basicProvider;
	private RuntimeProvider runtimeProvider;
	private NullTypeWrapper nullType = new NullTypeWrapper();

	private MainProvider() {
		this.basicProvider = new BasicProvider(this);
		this.runtimeProvider = new RuntimeProvider(this);
	}

	public static MainProvider instance() {
		if (instance == null) {
			synchronized (MainProvider.class) {
				if (instance == null) {
					instance = new MainProvider();
				}
			}
		}
		return instance;
	}

	public MainProvider ignorePrimitiveArrays(Boolean ignore) {
		runtimeProvider.setIgnorePrimitiveArrays(ignore);
		return this;
	}

	public MainProvider ignoreVarargs(Boolean ignore) {
		runtimeProvider.setIgnoreVarargs(ignore);
		return this;
	}

	public NullTypeWrapper getNullType() {
		return nullType;
	}

	public TypeWrapper getTypeByClassName(String className) {
		return getBasicTypesByClassName().containsKey(className)
				 ? basicProvider.getTypeByClassName(className)
				 : runtimeProvider.getTypeByClassName(className);
	}

	public TypeWrapper getTypeByName(String name) {
		return getBasicTypesByName().containsKey(name)
				 ? basicProvider.getTypeByName(name)
				 : runtimeProvider.getTypeByName(name);
	}

	public Map<String, TypeWrapper> getBasicTypesByName() {
		return basicProvider.getTypesByName();
	}

	public Map<String, TypeWrapper> getBasicTypesByClassName() {
		return basicProvider.getTypesByClassName();
	}

	public Map<String, TypeWrapper> getRuntimeTypesByName() {
		return runtimeProvider.getTypesByName();
	}

	public Map<String, TypeWrapper> getRuntimeTypesByClassName() {
		return runtimeProvider.getTypesByClassName();
	}

	public void registerType(TypeImpl type) {
		basicProvider.registerType(type);
	}

	public void handleException(ExceptionMessage cause, String... details) {
		String message = String.format(cause.getLocalizedMessage(), (Object[]) details);
		throw new PreparationException(message);
	}

	public void handleException(ExceptionMessage cause, Token start, String... details) {
		String message = String.format(cause.getLocalizedMessage(), (Object[]) details);
		throw new ExecutionException(message, start.getLine(), start.getCharPositionInLine());
	}

	public MainProvider reload() {
		basicProvider.reload();
		runtimeProvider.reload();
		return this;
	}

	public List<String> getResourceFiles(String path) throws IOException {
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

	public InputStream getResourceAsStream(String resource) {
		final InputStream in
								= getContextClassLoader().getResourceAsStream(resource);
		return in == null ? getClass().getResourceAsStream(resource) : in;
	}

	public ClassLoader getContextClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}
}
