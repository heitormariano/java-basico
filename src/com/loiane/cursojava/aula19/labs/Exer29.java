package com.loiane.cursojava.aula19.labs;

import java.util.Arrays;
import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[arrayA.length * 2];

		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			arrayC[i] = arrayA[i];
		}

		System.out.println("Array B");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayB[i] = scan.nextInt();
			arrayC[arrayB.length + i] = arrayB[i];
		}

		
		System.out.println("Elementos do Array A: " + Arrays.toString(arrayA));
		System.out.println("Elementos do Array B: " + Arrays.toString(arrayB));
		System.out.println("Elementos do Array C: " + Arrays.toString(arrayC));

	}
}
