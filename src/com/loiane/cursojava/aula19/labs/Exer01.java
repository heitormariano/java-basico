package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer01 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int[] arrayA = new int[5];
		int[] arrayB = new int[arrayA.length];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento de índice " + i + ":");
			arrayA[i] = scan.nextInt();
			/* arrayB[i] = arrayA[i]; */
		}

		for (int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}

		System.out.println();
		System.out.print("Array A = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		System.out.println();
		System.out.print("Array B = ");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
	}
}
