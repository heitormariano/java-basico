package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota:");
		double nota01 = scan.nextDouble();
		System.out.println("Informe a segunda nota:");
		double nota02 = scan.nextDouble();

		double media = (nota01 + nota02) / 2;
		if(media == 10.0){
			System.out.println("Aprovado com Distincao");
		}else if(media >= 7.0 && media < 10.0){
			System.out.println("Aprovado");
		}else{ //media < 7.0
			System.out.println("Reprovado");
		}
	}	
}