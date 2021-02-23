package com.test.herencia;


interface BaseInterface1{
	String getName();
}

interface BaseInterface2{
	String getName();
}

public class MyInterface implements BaseInterface1, BaseInterface2 {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}

//public class Implementador implemnets MyInterface{
//	
//}
