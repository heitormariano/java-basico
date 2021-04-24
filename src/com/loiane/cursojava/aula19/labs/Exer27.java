package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		char[] arrayB = new char[arrayA.length];

		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o valor do elemento  " + i + " :");
			arrayA[i] = scan.nextInt();

			if (arrayA[i] < 7) {
				arrayB[i] = 'a';
			} else if (arrayA[i] == 7) {
				arrayB[i] = 'b';
			} else if (arrayA[i] > 7 && arrayA[i] < 10) {
				arrayB[i] = 'c';
			} else if (arrayA[i] == 10) {
				arrayB[i] = 'd';
			} else if (arrayA[i] > 10) {
				arrayB[i] = 'e';
			}
		}

		System.out.println();
		System.out.print("Array A: ");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		System.out.println();
		System.out.print("Array B: ");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
	}
}
