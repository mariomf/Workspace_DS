package com.test.herencia;

public class Programmer extends Employee{

	public Programmer(String newName) {
		super(newName);
		// TODO Auto-generated constructor stub
	}

	
	//Si extiende de una clase abstracta, se deben de implementar 
	//todos sus metodos.
	@Override
	public double work() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
