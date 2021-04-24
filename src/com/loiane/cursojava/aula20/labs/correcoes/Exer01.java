package com.loiane.cursojava.aula20.labs.correcoes;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		int[][] numAleatorios = new int[4][4];

		Random numRandom = new Random();

		int linha = 0, coluna = 0;
		int maior = Integer.MIN_VALUE;
		
		// O exercício pede números aleatório entre 0 e 9. 
		//Na correção foram gerados números entre 0 e 99
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numRandom.nextInt(100);
			}
		}
		
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				if (numAleatorios[i][j] > maior) {
					maior = numAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		//imprimir elementos para conferência
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("O maior elemento: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
	}
}
