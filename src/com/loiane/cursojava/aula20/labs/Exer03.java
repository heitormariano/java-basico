package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner scan = new Scanner(System.in);

		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " : ");
				matriz[i][j] = scan.nextInt();
				if (matriz[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}

		System.out.println("Elementos da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Quantidade de elementos pares: " + qtdPares);
		System.out.println("Quantidade de elementos ímpares: " + qtdImpares);
		
	}
}
