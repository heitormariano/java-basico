package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		int[] arrayB = new int[arrayA.length];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = arrayA[(arrayA.length - 1) - i];
		}

		System.out.print("Array A: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();

		System.out.print("Array B: ");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
	}
}
