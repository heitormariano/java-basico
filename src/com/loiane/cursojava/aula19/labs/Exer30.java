package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		int[] arrayA = new int[20];
		int[] arrayB = new int[arrayA.length]; // pares
		int[] arrayC = new int[arrayA.length]; // impares

		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		int posB = 0;
		int posC = 0;

		for (int i = 0; i < arrayA.length; i++) {

			if (arrayA[i] % 2 == 0) {
				arrayB[posB] = arrayA[i];
				posB++;
			} else {
				arrayC[posC] = arrayA[i];
				posC++;
			}
		}

		System.out.print("Array A: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();

		System.out.print("Array B [Pares]: ");
		for (int i = 0; i < posB; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();

		System.out.print("Array C [Impares]: ");
		for (int i = 0; i < posC; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();

	}
}
