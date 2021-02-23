package com.test.java;

public class arrays_test {

	public static void main(String[] args) {
		//primitivos
		int[] primitivos = {1, 2, 3, 4};
		
		//Objetos
		String [] referencias = {"Hola"};
		
		System.out.println(primitivos.length);
		System.out.println(referencias.length);
		
		//Como se almacena en memoria?
		
		int[][] two0 = new int[2][3];
		
		String[] strArray = new String[2 * 5];
		
		String[] strArray1;
		strArray1 = new String[4];
		for (int i = 0; i < strArray1.length; i++) {
			strArray[i] = new String("Hello" + i);
		}
		System.out.println(strArray1);
		
		
		

	}

}
