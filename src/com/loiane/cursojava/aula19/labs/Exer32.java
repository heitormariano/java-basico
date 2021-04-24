package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {
	public static void main(String[] args) {
		int[] arrayA = new int[5];
		Scanner scan = new Scanner(System.in);

		System.out.println("Elementos da tabuada");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o valor " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Tabuada de " + arrayA[i]);
			for (int j = 0; j < 10; j++) {
				System.out.println(arrayA[i] + " X " + (j + 1) + " = " + arrayA[i] * (j + 1));
			}
			System.out.println();
		}
	}
}
