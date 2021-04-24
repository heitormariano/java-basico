package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizesP4 {

	// matrizes irregulares
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o número de pessoas que serão entrevistadas");
		int numEntrevistados = scan.nextInt();

		String[][] nomesFilhos = new String[numEntrevistados][];

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Informe a quantidade de filhos do entrevistado " + (i + 1) + " :");
			int qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			// Na linha cima está sendo criado um vetor como elemento da posição 0 do Array nomesFilhos
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (j + 1) + " :");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		System.out.println();
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("A quantidade de filhos da pessoa " + (i + 1) + " : " + nomesFilhos[i].length);
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Nome do filho " + (j + 1) + " : " + nomesFilhos[i][j]);
			}
		}
	}
}
