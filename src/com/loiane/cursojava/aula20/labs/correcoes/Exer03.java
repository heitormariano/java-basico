package com.loiane.cursojava.aula20.labs.correcoes;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Informe o elemento da pos [ " + i + " , " + j + " ]");
				numeros[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Elementos da Matriz");
		//imprimindo os valores
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}

		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}

		System.out.println();
		System.out.println("Quantidade de elementos pares: " + qtdPares);
		System.out.println("Quantidade de elementos ímpares: " + qtdImpares);
	}
}
