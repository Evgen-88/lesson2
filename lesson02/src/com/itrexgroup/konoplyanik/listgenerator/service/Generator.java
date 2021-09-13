package com.itrexgroup.konoplyanik.listgenerator.service;

import java.util.*;

import com.itrexgroup.konoplyanik.listgenerator.model.RandomList;

public class Generator {
	
	public RandomList generate() {
		List<Integer> list = new ArrayList<>(3);
		
		for(int i = 0; i < 3; i++) {
			list.add((int) (Math.random() * 10));
		}
		
		return new RandomList(list);
	}
}
