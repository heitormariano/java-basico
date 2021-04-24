package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double numero;
		double soma = 0;
		int count = 0;

		System.out.println("Programa - Soma e media de numeros");

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero:");
			numero = scan.nextDouble();
			soma += numero;
			count = i + 1;
		}

		double media = soma / count;

		System.out.println("A soma dos numeros: " + soma);
		System.out.println("A media dos numeros: " + media);
	}
}
