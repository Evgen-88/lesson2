package com.itrexgroup.konoplyanik.listgenerator.service;

import com.itrexgroup.konoplyanik.listgenerator.exception.InvalidListException;
import com.itrexgroup.konoplyanik.listgenerator.model.RandomList;

public class ValidatorService {
	
	public void validate(RandomList list) throws InvalidListException {
		String msg = "";
		boolean valid = true;
		for(int i : list.getList()) {
			if(i % 2 == 0) {
				msg += (i + " ");
				valid = false;
			}
		}
		
		if(!valid)
			throw new InvalidListException("Invalid list", list.getList(), msg.trim());
	}
}
