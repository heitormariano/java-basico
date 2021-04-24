package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra:");
		String entrada = scan.next();

		if (entrada.length() > 1) {
			System.out.println("Letra invalida!");
		} else {
			if (entrada.equalsIgnoreCase("a") || entrada.equalsIgnoreCase("e") || entrada.equalsIgnoreCase("i")
					|| entrada.equalsIgnoreCase("o") || entrada.equalsIgnoreCase("u")) {
				System.out.println("A letra e vogal");
			} else {
				System.out.println("A letra e consoante");
			}
		}

		/*
		 * switch(entrada){ case "a": case "e": case "i": case "o": case "u":
		 * case "A": case "E": case "I": case "O": case "U":
		 * System.out.println("A letra e vogal"); break; default:
		 * System.out.println("A letra e consoante"); }
		 */

	}
}