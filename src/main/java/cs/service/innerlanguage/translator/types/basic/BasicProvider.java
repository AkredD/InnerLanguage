/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types.basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anisimov_a_v
 */
public final class BasicProvider {
	private static final String TYPEPATH = "types";
	private static BasicProvider instance;

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

	public void reload() {
		try {
			for (String name : getResourceFiles(TYPEPATH)) {
				ObjectMapper mapper = new ObjectMapper();
				TypesTreeView view = mapper.readValue(getContextClassLoader().getResourceAsStream(TYPEPATH + File.separator + name), TypesTreeView.class);
				System.out.println(view.getTypeNode().getClassPath() + view.getTypeNode().getClassName());
			}
		} catch (IOException ex) {
			Logger.getLogger(BasicProvider.class.getName()).log(Level.SEVERE, null, ex);
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
