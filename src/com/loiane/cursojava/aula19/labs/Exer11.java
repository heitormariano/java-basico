package com.loiane.cursojava.aula19.labs;
import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arrayA = new int[10];
		int count = 0;

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println();
		System.out.print("Array A = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		System.out.println();
		System.out.println("Quantidade de elementos pares: " + count);

	}
}