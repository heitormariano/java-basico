package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Analisando o elemento " + arrayA[i]);
			for (int j = 0; j <= arrayA[i]; j++) { // 0 (zero) é considerado na verificação de números pares (0 é um número par)
				if(j % 2 == 0){
					System.out.println("O número " + j + " é PAR");
				}
			}

		}
	}
}
