package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer36 {
	// Idêntico ao Exercício 34
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int qtdElem;
		double soma = 0;

		System.out.println("Informe a quantidade de Elementos:");
		qtdElem = scan.nextInt();

		String output = "H = ";

		for (int i = 1, j = 1; j <= qtdElem; j++) {
			if (j != qtdElem) {
				output += i + "/" + j + " + ";

			} else {
				output += i + "/" + j;
			}
		}

		// for apenas para calcular o resultado (soma) dos termos
		for (double i = 1, j = 1; j <= qtdElem; j++) {
			soma += i / j;
		}
		System.out.println(output);
		System.out.println("H (Soma) = " + soma);
	}
}
