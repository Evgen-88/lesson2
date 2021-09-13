package com.itrexgroup.konoplyanik.listgenerator.service;

import com.itrexgroup.konoplyanik.listgenerator.exception.InvalidListException;
import com.itrexgroup.konoplyanik.listgenerator.model.RandomList;

public class Creator {
	private Generator generator = new Generator();
	private Validator validator = new Validator();
	
	public void createList() {
		while(true) {
			RandomList list = generator.generate();
			try {
				validator.validate(list);
				System.out.println("Valid list created: " + list.toString());
				break;
			} catch(InvalidListException e) {
				System.out.println(e.getMessage() + ": " + e.getList().toString() + ", invalid numbers: " + e.getInvalidNumbers());
			}
		}
	}
}
