package com.loiane.cursojava.aula19.labs;

import java.util.Arrays;
import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[arrayA.length];

		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o valor do elemento  " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		System.out.println();
		System.out.println("Array B");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayB[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayC.length; i++) {
			if (arrayA[i] > arrayB[i]) {
				arrayC[i] = 1;
			} else if (arrayA[i] == arrayB[i]) {
				arrayC[i] = 0;
			} else {
				arrayC[i] = -1;
			}
		}

		System.out.println("Array A: " + Arrays.toString(arrayA));
		System.out.println("Array B: " + Arrays.toString(arrayB));
		System.out.println("Array C: " + Arrays.toString(arrayC));
	}
}
