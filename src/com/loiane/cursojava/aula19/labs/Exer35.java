package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Divisores de  " + arrayA[i] + " :");
			for (int j = 1; j <= arrayA[i]; j++) { 
				if (arrayA[i] % j == 0) { //não pode ser feita uma divisão por 0 (a variável j deve iniciar com o valor 1)
					System.out.println(j);
				}
			}

		}
	}
}
