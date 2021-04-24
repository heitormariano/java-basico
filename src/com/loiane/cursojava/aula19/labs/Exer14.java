package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		int somaImpares = 0;
		int qtdImpares = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] % 2 != 0) {
				somaImpares += arrayA[i];
				qtdImpares++;
			}
		}

		// brincando com foreach
		System.out.print("Array A = ");
		for (int elem : arrayA) {
			System.out.print(elem + " ");
		}
		System.out.println();
		
		double media = somaImpares / qtdImpares;
		System.out.println("A soma dos elementos do array: " + somaImpares);
		System.out.println("A média simples entre os números ímpares: " + media);
	}
}
