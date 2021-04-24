package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um dos valores: M (masculino) ou F (feminino)");
		String entrada = scan.next();


		if(entrada.equalsIgnoreCase("M")){
			System.out.println("Sexo Masculino escolhido");
		}else if(entrada.equalsIgnoreCase("F")){
			System.out.println("Sexo Feminino escolhido");
		}else{
			System.out.println("Sexo invalido");
		}

		//testar com Java 8 no meu PC
		/*
		switch(entrada){
			case "M":
				System.out.println("Sexo Masculino escolhido");
				break;
			case "F":
				System.out.println("Sexo Feminino escolhido");
				break;
			default:
				System.out.println("Sexo invalido");
		} */
	}	
}