package com.itrexgroup.konoplyanik.listgenerator;

import com.itrexgroup.konoplyanik.listgenerator.service.CreatorService;

public class ListgeneratorApplication {

	public static void main(String[] args) {
		CreatorService creator = new CreatorService();
		
		creator.createList();
	}

}
