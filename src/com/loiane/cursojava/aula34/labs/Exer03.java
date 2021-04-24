package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		/*
		 * System.out.println("Fatorial de 5: " + Calculadora.fatorial(5));
		 * System.out.println("Fatorial de 6: " + Calculadora.fatorial(6));
		 */

		Scanner scan = new Scanner(System.in);
		int num = 0;
		do{
			System.out.println("Informe um n�mero (positivo) para o fatorial");
			num = scan.nextInt();
			if(num < 0){
				System.out.println("N�mero inv�lido. Refa�a a opera��o.");
			}
		}while(num < 0);
		System.out.println("Fatorial de " + num + ": " + Calculadora.fatorial(num));
	}
}
