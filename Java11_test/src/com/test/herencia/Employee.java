package com.test.herencia;

public abstract class Employee {
	
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	//Methodo abstracto
	public abstract double work();
}
