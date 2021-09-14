package com.itrexgroup.konoplyanik.errorgenerator.service;

import java.util.*;

public class ErrorGeneratorService {

	public void generateError() {
// декодируем строку в байт-массив
		String clazzBase64 = "yv66vgAAADcADAEAEm15cGFja2FnZS9NeWNsYXNzMAcAAQEAEGphdmEvbGFuZy9PYmplY3QHAAMBAApTb3VyY2VGaWxlAQANTXljbGFzczAuamF2YQEABjxpbml0PgEAAygpVgwABwAICgAEAAkBAARDb2RlACEAAgAEAAAAAAABAAEABwAIAAEACwAAABEAAQABAAAABSq3AAqxAAAAAAABAAUAAAACAAY=";
		byte[] compiledClazz = Base64.getDecoder().decode(clazzBase64);
		int len = Integer.valueOf(compiledClazz[12]);
// инициализируем собственный загрузчик файлов
		MyClassLoader myClassLoader = new MyClassLoader(Thread.currentThread().getContextClassLoader());
/*
 * в бесконечном цикле:
 * 						разворачиваем строку с номером текущей итерации в байт-массив
 * 						генерим байт-код перетасовывая полученные байт-массивы (многократным частичным копированием)
 * 						создаем имя будущего класса с номером текущей итерации
 * 						передаем имя и байткод нашему загрузчику и тот создает новый класс
 * (колбасим классы пока не заполним Metaspace)
 */
		for (int i = 0;; i++) {
			byte[] bytes = String.valueOf(i).getBytes();
			byte[] bytecode = new byte[compiledClazz.length + bytes.length - 1];
			System.arraycopy(compiledClazz, 0, bytecode, 0, 30);
			bytecode[12] = (byte) (len + bytes.length - 1 & 0xFF);

			System.arraycopy(bytes, 0, bytecode, 30, bytes.length);
			System.arraycopy(compiledClazz, 31, bytecode, 30 + bytes.length, compiledClazz.length - 31);

			String classname = "mypackage.Myclass" + i;
			myClassLoader.getClass(classname, bytecode);
		}
	}

	public static class MyClassLoader extends ClassLoader {
		public MyClassLoader(ClassLoader parent) {
			super(parent);
		}

		public Class<?> getClass(String name, byte[] code) {
			return defineClass(name, code, 0, code.length);
		}
	}
}