package com.loiane.cursojava.aula20;

public class MatrizesP3 {

	public static void main(String[] args) {
		//matriz tridimensional
		int[][][] matriz = new int[3][3][3];
		
		//atribuição de valores para a matriz
		//acompanhado os incrementos das variáveis i, j e k.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matriz[i][j][k] = i + j + k;
				}
			}
		}
		
		//soma total dos elementos da matriz
		//Soma dos elementos pares e impares
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		//int qtdIteracoes = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {
					soma += matriz[i][j][k];
					//qtdIteracoes++;
					if (matriz[i][j][k] % 2 == 0) {
						somaPares += matriz[i][j][k];
					} else {
						somaImpares += matriz[i][j][k];
					}
				}
			}
		}
		System.out.println();
		System.out.println("Soma total = " + soma);
		System.out.println("Soma dos pares = " + somaPares);
		System.out.println("Soma dos ímpares = " + somaImpares);
		//System.out.println("Qtd iterações = " + qtdIteracoes);
	}
}
