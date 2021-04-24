package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		Random random = new Random();

		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;

		int maiorCol7 = Integer.MIN_VALUE;
		int menorCol7 = Integer.MAX_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10);
				if (i == 4) {
					if (matriz[i][j] < menorLinha5) {
						menorLinha5 = matriz[i][j];
					}
					if (matriz[i][j] > maiorLinha5) {
						maiorLinha5 = matriz[i][j];
					}
				} else if (j == 6) {
					if (matriz[i][j] < menorCol7) {
						menorCol7 = matriz[i][j];
					}
					if (matriz[i][j] > maiorCol7) {
						maiorCol7 = matriz[i][j];
					}
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Análise da linha 5");
		System.out.println("Maior elemento: " + maiorLinha5);
		System.out.println("Menor elemento: " + menorLinha5 + "\n");

		System.out.println("Análise da Coluna 7");
		System.out.println("Maior elemento: " + maiorCol7);
		System.out.println("Menor elemento: " + menorCol7);
	}
}
