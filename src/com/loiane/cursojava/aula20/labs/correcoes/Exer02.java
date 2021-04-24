package com.loiane.cursojava.aula20.labs.correcoes;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		int[][] numAleatorios = new int[10][10];

		Random numRandom = new Random();

		// O exerc�cio pede n�meros aleat�rio entre 0 e 9.
		// Na corre��o foram gerados n�meros entre 0 e 99
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numRandom.nextInt(100);
			}
		}

		// imprimir elementos para confer�ncia
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				System.out.print("   " + numAleatorios[i][j] + "  ");
			}
			System.out.println();
		}
		
		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 4; // o �ndice incial � zero. Portanto, linha 5 tem o �ndice 4
		
		for (int i = 0; i < numAleatorios[linha5].length; i++) {
			if (numAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numAleatorios[linha5][i];
			}

			if (numAleatorios[linha5][i] < menorL5) {
				menorL5 = numAleatorios[linha5][i];
			}
		}
		
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;
		int coluna7 = 6; // o �ndice incial � zero. Portanto, coluna 7 tem o �ndice 6
		
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i][coluna7]; j++) {
				if (numAleatorios[i][coluna7] > maiorC7) {
					maiorC7 = numAleatorios[i][coluna7];
				}
				if (numAleatorios[i][coluna7] < menorC7) {
					menorC7 = numAleatorios[i][coluna7];
				}
			}
		}
		
		System.out.println();
		System.out.println("Maior da linha 5: " + maiorL5);
		System.out.println("Menor da linha 5: " + menorL5);
		System.out.println("Maior da coluna 7: " + maiorC7);
		System.out.println("Menor da coluna 7: " + menorC7);
	}
}
