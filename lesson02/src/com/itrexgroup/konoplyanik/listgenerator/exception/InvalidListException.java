package com.itrexgroup.konoplyanik.listgenerator.exception;

import java.util.List;

@SuppressWarnings("serial")
public class InvalidListException extends RuntimeException {
	private final List<Integer> list;
	private final String invalidNumbers;

	public InvalidListException(String message, List<Integer> list, String invalidNumbers) {
		super(message);
		this.list = list;
		this.invalidNumbers = invalidNumbers;
	}
	
	public List<Integer> getList() {
		return list;
	}

	public String getInvalidNumbers() {
		return invalidNumbers;
	}
}
