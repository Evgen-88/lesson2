package com.itrexgroup.konoplyanik.errorgenerator;

import com.itrexgroup.konoplyanik.errorgenerator.model.ErrorGenerator;

public class ErrorgeneratorApplication {

	public static void main(String[] args) {
		ErrorGenerator errorGenerator = new ErrorGenerator();
		errorGenerator.generateError();
	}

}
