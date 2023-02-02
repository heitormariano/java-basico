package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
	  // Programa realiza a leitura de 3 numeros. 
	  // Em seguida, imprime os valores em ordem decrescente
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		double num01 = scan.nextDouble();

		System.out.println("Digite o segundo numero:");
		double num02 = scan.nextDouble();

		System.out.println("Digite o terceiro numero:");
		double num03 = scan.nextDouble();

		/*
		 * 
		 * Considerando tres numeros hipoteticos: num01 (A), num02(B), num03(C) 
		 * Possibilidades existentes:
		 * 
		 * num01 < num02 < num03 (A < B < c)
		 * 
		 * num01 < num03 < num02 (A < C < B)
		 * 
		 * 
		 * num02 < num01 < num03 (B < A < C)
		 * 
		 * num02 < num03 < num01 (B < C < A)
		 * 
		 * 
		 * num03 < num01 < num02 (C < A < B)
		 * 
		 * num03 < num02 < num01 (C < B < A)
		 * 
		 */
		System.out.println("Ordem decrescente:");

		if ((num01 <= num02 && num01 <= num03) && (num02 <= num03)) {
			// situacao: num01 < num02 < num03
			System.out.println(num03 + " - " + num02 + " - " + num01);
		} else if ((num01 <= num03 && num01 <= num02) && (num03 <= num02)) {
			// situacao: num01 < num03 < num02
			System.out.println(num02 + " - " + num03 + " - " + num01);
		} else if ((num02 <= num01 && num02 <= num03) && (num01 <= num03)) {
			// situacao: num02 < num01 < num03
			System.out.println(num03 + " - " + num01 + " - " + num02);
		} else if ((num02 <= num03 && num02 <= num01) && (num03 <= num01)) {
			// situacao: num02 < num03 < num01
			System.out.println(num01 + " - " + num03 + " - " + num02);
		} else if ((num03 <= num01 && num03 <= num02) && (num01 <= num02)) {
			// situacao: num03 < num01 < num02
			System.out.println(num02 + " - " + num01 + " - " + num03);
		} else if ((num03 <= num02 && num03 <= num01) && (num02 <= num01)) {
			// situacao: num03 < num02 < num01
			System.out.println(num01 + " - " + num02 + " - " + num03);
		}

	}
}