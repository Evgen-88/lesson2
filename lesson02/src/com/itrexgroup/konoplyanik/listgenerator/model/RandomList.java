package com.itrexgroup.konoplyanik.listgenerator.model;

import java.util.*;

public class RandomList {
	private List<Integer> list;
	
	public RandomList(List<Integer> list) {
		this.list = list;
	}
	
	public List<Integer> getList(){
		return list;
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
