package com.trybe.idadeemdias;

public class Pessoa {
	
	public void calculardias(String name, String anos, String meses, String dias) {
		
		int anosNumber = Integer.parseInt(anos) * 365;
		int mesesNumber = Integer.parseInt(meses) * 12;
		int diasNumber = Integer.parseInt(dias);
		
		int counter = anosNumber + mesesNumber + diasNumber;
		
		System.out.println("Olá " + name + ", sua idade em dias é " + counter);
		
	}
	

	
}
