package com.test.modulos;

import java.io.File;
import java.io.FileInputStream;

public class Dependencias {

	public static void main(String[] args) {
		FileInputStream xmlInputStream;
		try {
			xmlInputStream = new FileInputStream(new File("xml"));
			SAXReader.saxReader = new SAXReader();
			saxReader.setFeature();
			
		}

	}

}
