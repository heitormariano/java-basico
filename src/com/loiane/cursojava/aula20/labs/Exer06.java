package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {
	private static char[][] jogoVelha = new char[3][3];
	private static Scanner scan = new Scanner(System.in);
	private static int linha, coluna;
	private static boolean ganhou;
	private static int jogada;// incrementar na medida que novas jogadas são feitas
	private static char sinal;

	public static void main(String[] args) {
		linha = 0;
		coluna = 0;
		ganhou = false;
		jogada = 1;

		System.out.println("Jogo da Velha Master");
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");

		while (!ganhou) {
			if (jogada % 2 == 1) { // jogador 1
				System.out.println("Vez do Jogador 1. Escolha da posição da marcação.");
				sinal = 'X';
			} else {
				System.out.println("Vez do Jogador 2. Escolha da posição da marcação.");
				sinal = 'O';
			}

			informarLinha();
			informarColuna();

			boolean posicaoLivre = hasPosicaoLivre();
			if (!posicaoLivre) {
				System.out.println("Posição já usada, tente novamente.");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			imprimirTabuleiro();
			verificarGanhador();
		}
	}

	public static void informarLinha() {
		boolean linhaValida = false;

		while (!linhaValida) {
			System.out.println("Informe a linha (1, 2 ou 3):");
			linha = scan.nextInt();

			if (linha >= 1 && linha <= 3) {
				linhaValida = true;
				linha--; // as linhas devem ter o valor entre 0 e 2
			} else {
				System.out.println("Entrada inválida, tente novamente.");
			}
		}
	}

	public static void informarColuna() {
		boolean colunaValida = false;
		while (!colunaValida) {
			System.out.println("Informe a coluna (1, 2 ou 3):");
			coluna = scan.nextInt();

			if (coluna >= 1 && coluna <= 3) {
				colunaValida = true;
				coluna--; // as colunas devem ter o valor entre 0 e 2
			} else {
				System.out.println("Entrada inválida, tente novamente.");
			}
		}
	}

	public static void imprimirTabuleiro() {
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean hasPosicaoLivre() {
		if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
			return false;
		} else {
			return true;
		}
	}
	
	public static void verificarGanhador() {
		if (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X'
				|| jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X'
				|| jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X'

				|| jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X'
				|| jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X'
				|| jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X'

				|| jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X'
				|| jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X') {
			ganhou = true;
			System.out.println("Jogador 1 ganhou");

		} else if (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O'
				|| jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O'
				|| jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O'

				|| jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O'
				|| jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O'
				|| jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O'

				|| jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O'
				|| jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O') {
			ganhou = true;
			System.out.println("Jogador 2 ganhou");
		} else if (jogada > 9) { // são realizadas, no máximo, 9 jogadas
			ganhou = true;
			System.out.println("Ninguém ganhou");
		}
	}
}
