package com.loiane.cursojava.aula19.labs;

import java.util.Arrays;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		int[] arrayA = new int[20];
		int[] arrayB = new int[arrayA.length];

		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("informe o elemeto " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		int posPares = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % 2 == 0) {
				arrayB[posPares] = arrayA[i];
				posPares++;
			}
		}

		int posImpares = posPares;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % 2 != 0) {
				arrayB[posImpares] = arrayA[i];
				posImpares++;
			}
		}

		System.out.println("Array A: " + Arrays.toString(arrayA));
		System.out.println("Array B: " + Arrays.toString(arrayB));
	}
}
