package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {
	public static void main(String[] args) {
		int[] arrayA = new int[10];
		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("informe o elemento " + i + " : ");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayA.length; i++) {
			int qtdDiv = 0;
			for (int j = 1; j <= arrayA[i]; j++) {
				if (arrayA[i] % j == 0) {
					qtdDiv++;
				}
			}
			if (arrayA[i] == 1) {
				System.out.println(arrayA[i] + " - Primo");
			} else if (qtdDiv == 2) {
				System.out.println(arrayA[i] + " - Primo");
			} else {
				System.out.println(arrayA[i] + " - NÃO é primo");
			}
		}

	}
}
