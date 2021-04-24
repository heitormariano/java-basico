package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Programa turno");
		System.out.println("Digite M (Matutitno) - V (vespertino) - N (Noturno)");
		String turno = scan.next();

		if(turno.equalsIgnoreCase("M")){
			System.out.println("Bom dia!");
		}else if(turno.equalsIgnoreCase("V")){
			System.out.println("Boa tarde!");
		}else if(turno.equalsIgnoreCase("N")){
			System.out.println("Boa Noite!");
		}else{
			System.out.println("Valor invalido");
		}
	}
}