package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05V2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double popA;
		double taxaPopA;

		double popB;
		double taxaPopB;

		boolean valido = false; // uso de somente uma variavel do tipo boolean (flag única para o algoritmo)
		do {
			System.out.println("Informe a populacao do pais A:");
			popA = scan.nextDouble();
			if (popA <= 0) {
				System.out.println("Populacao menor ou igual a zero. Digite o dado novamente");
			} else {
				valido = true;
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Informe a taxa de crescimento do pais A:");
			taxaPopA = scan.nextDouble();

			if (taxaPopA <= 0) {
				System.out.println("Taxa de crescimento menor ou igual a zero. Digite o dado novamente");
			} else {
				valido = true;
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Informe a populacao do pais B:");
			popB = scan.nextDouble();

			if (popB <= 0) {
				System.out.println("Populacao menor ou igual a zero. Digite o dado novamente");
			} else {
				valido = true;
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Informe a taxa de crescimento do pais B:");
			taxaPopB = scan.nextDouble();

			if (taxaPopB <= 0) {
				System.out.println("Taxa de crescimento menor ou igual a zero. Digite o dado novamente");
			} else {
				valido = true;
			}
		} while (!valido);

		int count = 0;
		while (popA < popB) {
			popA += popA * taxaPopA; // popA = popA + popA * taxaPopA;
			popB += popB * taxaPopB; // popB = popB + popB * taxaPopB;
			count++;
		}

		System.out.println("Populacao A = " + popA);
		System.out.println("Populacao B = " + popB);
		System.out.println("Quantidade de anos = " + count);
	}
}
