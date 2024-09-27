package com.trybe.idadeemdias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		String nome = scan.next();
		System.out.println("Qual é sua idade em anos, meses e dias?");
		System.out.println("anos:");
		String anos = scan.next();
		System.out.println("meses:");
		String meses = scan.next();
		System.out.println("dias:");
		String dias = scan.next();
		scan.close();
		
		System.out.println("então " + nome +  " tem  " + anos + " anos " + meses + " meses " + dias + " dias!" );
		
		Pessoa user = new Pessoa();
		
		user.calculardias(nome, anos, meses, dias);
		
		
	}

}