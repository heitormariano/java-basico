package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];

		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;

		Random random = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10);
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}

		System.out.println("Valores da Matriz");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Elementos do vetor " + i + " do Array principal : ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Maior elemento: " + maior);
		System.out.println("Posição do maior elemento: Linha " + linha + "(índice)" + " - Coluna " + coluna + "(índice)");
	}
}
