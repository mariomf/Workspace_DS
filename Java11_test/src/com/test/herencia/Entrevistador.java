package com.test.herencia;

import java.time.LocalDateTime;

//La interface no puede tener constructor
//
public interface Entrevistador {

	void entrevistador();//es un metodo abstracto, pero al enstar en la interface, el compliador ya los sabe
	//PUEDE TENER 0 METODOS.
	public double entrevistar(String name);
	
	public void darFeedback(String name);
	//modificador PUBLIC es redundante 
	
	default void submitInterviewStatus() {
		System.out.println("Accept");
	}
	
	static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
		System.out.println("Interview");
		System.out.println("");
		
	}

}
