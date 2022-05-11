package com.spring5study.beanIntro;

import java.util.*;

/**
 * @author Jiahao Wang
 * @create 2022-05-11 17:58
 */
public class Student {
	private String[] array;
	private List<String> list;
	private Map<String, String> map;
	private Set<String> set;

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Student{" +
				"array=" + Arrays.toString(array) +
				", list=" + list +
				", map=" + map +
				", set=" + set +
				'}';
	}
}
