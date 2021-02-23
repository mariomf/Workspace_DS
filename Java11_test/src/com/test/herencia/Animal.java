package com.test.herencia;

interface Jumpable{
	int MIN_DISTACE = 10;
	abstract String currentPosition();
}

interface Moveable {
	String MIN_DISTACE = "FAR";
	abstract String currentPosition();
}


public class Animal implements Jumpable, Moveable {

	@Override
	public String currentPosition() {
		// TODO Auto-generated method stub
		return null;
	}

}
