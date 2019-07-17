/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.utils;

/**
 *
 * @author anisimov_a_v
 */
public class Pair<U, T> {
	private U key;
	private T value;

	public Pair(U key, T value) {
		this.key = key;
		this.value = value;
	}

	public U getKey() {
		return key;
	}

	public void setKey(U key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
