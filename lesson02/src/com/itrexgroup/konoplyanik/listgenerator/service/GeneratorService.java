package com.itrexgroup.konoplyanik.listgenerator.service;

import java.util.*;

import com.itrexgroup.konoplyanik.listgenerator.model.RandomList;

public class GeneratorService {
	
	public RandomList generate() {
		List<Integer> list = new ArrayList<>(3);
		
		for(int i = 0; i < 3; i++) {
			list.add((int) (Math.random() * 9) + 1);
		}
		
		return new RandomList(list);
	}
}
