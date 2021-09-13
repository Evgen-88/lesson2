package com.itrexgroup.konoplyanik.listgenerator;

import com.itrexgroup.konoplyanik.listgenerator.service.Creator;

public class ListgeneratorApplication {

	public static void main(String[] args) {
		Creator creator = new Creator();
		
		creator.createList();
	}

}
