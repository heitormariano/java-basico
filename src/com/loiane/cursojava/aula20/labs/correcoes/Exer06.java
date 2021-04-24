package com.loiane.cursojava.aula20.labs.correcoes;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");

		boolean ganhou = false;
		int jogada = 1; // incrementar na medida que novas jogadas são feitas
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {
			if (jogada % 2 == 1) { // jogador 1
				System.out.println("Vez do Jogador 1. Escolha da posição da marcação.");
				sinal = 'X';
			} else {
				System.out.println("Vez do Jogador 2. Escolha da posição da marcação.");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Informe a linha (1, 2 ou 3):");
				linha = scan.nextInt();

				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Informe a coluna (1, 2 ou 3):");
				coluna = scan.nextInt();

				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}

			linha--;
			coluna--;

			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente.");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			// imprimir o tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			System.out.println();
			// verificar se existe um ganhador
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
}
