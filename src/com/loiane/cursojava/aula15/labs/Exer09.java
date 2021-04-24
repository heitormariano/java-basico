package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		double num01 = scan.nextDouble();

		System.out.println("Digite o segundo numero:");
		double num02 = scan.nextDouble();

		System.out.println("Digite o terceiro numero:");
		double num03 = scan.nextDouble();

		/*
		 * 
		 * considerando três números hipotéticos: A, B, C possibilidades:
		 * 
		 * A < B < C
		 * 
		 * A < C < B
		 * 
		 * 
		 * B < A < C
		 * 
		 * B < C < A
		 * 
		 * 
		 * C < A < B
		 * 
		 * C < B < A
		 * 
		 */
		System.out.println("Ordem decrescente:");

		if ((num01 <= num02 && num01 <= num03) && (num02 <= num03)) {
			// situação: A < B < C
			System.out.println(num03 + " - " + num02 + " - " + num01);
		} else if ((num01 <= num03 && num01 <= num02) && (num03 <= num02)) {
			// situação: A < C < B
			System.out.println(num02 + " - " + num03 + " - " + num01);
		} else if ((num02 <= num01 && num02 <= num03) && (num01 <= num03)) {
			// situação: B < A < C
			System.out.println(num03 + " - " + num01 + " - " + num02);
		} else if ((num02 <= num03 && num02 <= num01) && (num03 <= num01)) {
			// situação: B < C < A
			System.out.println(num01 + " - " + num03 + " - " + num02);
		} else if ((num03 <= num01 && num03 <= num02) && (num01 <= num02)) {
			// situação: B < C < A
			System.out.println(num02 + " - " + num01 + " - " + num03);
		} else if ((num03 <= num02 && num03 <= num01) && (num02 <= num01)) {
			// situação: C < B < A
			System.out.println(num01 + " - " + num02 + " - " + num03);
		}

	}
}