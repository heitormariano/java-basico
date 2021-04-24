package com.loiane.cursojava.aula19.labs;
import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arrayA = new int[10];
		int soma = 0;

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			soma += arrayA[i];
		}
		System.out.println();
		System.out.print("Array A = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		System.out.println();
		System.out.println("A soma dos elementos: " + soma);
	}
}