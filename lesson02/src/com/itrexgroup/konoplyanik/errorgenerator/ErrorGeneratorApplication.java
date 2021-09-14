package com.itrexgroup.konoplyanik.errorgenerator;

import com.itrexgroup.konoplyanik.errorgenerator.service.ErrorGeneratorService;

public class ErrorGeneratorApplication {

	public static void main(String[] args) {
		ErrorGeneratorService errorGenerator = new ErrorGeneratorService();
		errorGenerator.generateError();
	}

}
