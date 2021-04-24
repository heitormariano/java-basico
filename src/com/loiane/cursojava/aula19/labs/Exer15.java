package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];

		double total = arrayA.length;
		double qtdImpares = 0;
		double qtdPares = 0;

		double percPares;
		double percImpares;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}
		}

		percPares = (qtdPares / total) * 100;
		percImpares = (qtdImpares / total) * 100;

		System.out.println();
		System.out.println("Percentual pares: " + percPares + " %");
		System.out.println("Percentual ímpares: " + percImpares + " %");

	}
}
