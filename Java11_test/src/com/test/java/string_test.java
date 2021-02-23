package com.test.java;

public class string_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String cadena1 = "Java";
//		String cadena2 = "Java";//las variables se guardan en el pool
//		String cadena3 = new String("Java");//La palabra 'new' forza que se reserve un nuevo espacio en memoria
//		
//		System.out.print(cadena1 == cadena2);
//		System.out.println(" " + cadena1 + " " + cadena2);
//		System.out.print(cadena1 == cadena3);
//		System.out.println(" " + cadena1 + " " + cadena3);
//		inmutabilidad();
		metodosString();
	}
	
	private static void inmutabilidad() {
		String cadena1 = "Java";
		String cadena2 = "Java";
		
//		System.out.println(cadena1 == cadena2);
//		cadena1 = cadena1 + "11";//se crean 2 objetos el "11" y la union de cadena con "11"
//		//en el pool se verian 3 objetos (Java, Java11 y 11)
//		System.out.println(cadena1 == cadena2);
		cadena1.concat(" 11");//no se puede (no se esta haciendo nada)
		System.out.println(cadena1);
		cadena1 = cadena1.concat(" 11");//se esta creando un nuevo objeto
		System.out.println(cadena1);
	}
	
	private static void metodosString() {
		String cadena = "ejemplo";
		//System.out.println(cadena.charAt(20));//StringIndexOutOfBoundsException estas fuera de rango de la cadena de caracteres
		//System.out.println(cadena.charAt(2));
		System.out.println(cadena.indexOf('e'));
		//System.out.println(cadena.indexOf("axd"));//Si no lo encuentra regresa -1
		System.out.println(cadena.indexOf('e',1));//Busca a partir del index 1
		System.out.println(cadena.substring(1,3));//El index esta antes de la letra
		System.out.println(cadena.indexOf("ejemplo"));
		System.out.println(cadena.substring(0,7));//Decreciente y fuera de rango
//		System.out.println(cadena.split(","));
		String cadena2 = new String("ejemplo").intern();//con esto puedes forzar que busque dentro del pool
		System.out.println(cadena == cadena2);
		String cadena3 = " ejemplo".trim();//el trim se ejecuta en runtime por lo que no sabe que es igual al pool en compilacion por esto hace un nuevo objeto
		System.out.println(cadena == cadena3);
		
		String name = null;//Esto no marca NullPointer
		name += "11";
		System.out.println(name);
	}
	
	private static boolean semantico() {
		//java solo hace analisis sintactico
		if(true) {
			return true;
		}else {
//			return false;
		}
		return false;
	}

	private static void stringBuilder() {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(sb1);
		StringBuilder sb3 = new StringBuilder(50);//Si se llena se crea un nuevo arreglo del doble del tamaño.
		StringBuilder sb4 = new StringBuilder("Shreya Gupta");
	}
}
