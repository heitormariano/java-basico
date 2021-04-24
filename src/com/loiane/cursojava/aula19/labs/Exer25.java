package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		int[] arrayB = new int[arrayA.length];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % 2 == 0) {
				arrayB[i] = 1;
			} else {
				arrayB[i] = 0;
			}
		}

		System.out.print("Elementos do vetor A : ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Elementos do vetor B : ");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
	}
}
