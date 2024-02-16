package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class JogoVelhaV3 {
	private char[][] tabuleiro;
	private Scanner scan;
	private int linha;
	private int coluna;
	private boolean hasGanhador;
	private int qtdJogadas;
	private char sinal;

	public JogoVelhaV3() {
		tabuleiro = new char[][] { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		scan = new Scanner(System.in);
		qtdJogadas = 1;
	}

	public void iniciarJogo() {
		System.out.println(">>> Jogo da Velha Master <<<");

		imprimirTabuleiro();

		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");

		while (!hasGanhador) {
			if (qtdJogadas % 2 == 1) {
				System.out.println("Vez do Jogador 1. Escolha da posicao da marcacao.");
				sinal = 'X';
			} else {
				System.out.println("Vez do Jogador 2. Escolha da posicao da marcacao.");
				sinal = 'O';
			}

			informarLinha();
			informarColuna();
			realizarMarcacao();

			imprimirTabuleiro();
			verificarGanhador();
		}
	}

	public void imprimirTabuleiro() {
		System.out.println();
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			if (i != 2) {
				System.out.println();
				System.out.println("--+---+----");
			}
		}
		System.out.println("\n");
	}

	public void informarLinha() {
		boolean linhaValida = false;
		while (!linhaValida) {
			System.out.println("Informe a linha (1, 2 ou 3):");
			linha = scan.nextInt();

			if (linha >= 1 && linha <= 3) {
				linhaValida = true;
				linha--;
			} else {
				System.out.println("Entrada invalida. Digite novamente.");
			}
		}
	}

	public void informarColuna() {
		boolean colunaValida = false;
		while (!colunaValida) {
			System.out.println("Informe a coluna (1, 2 ou 3):");
			coluna = scan.nextInt();

			if (coluna >= 1 && coluna <= 3) {
				colunaValida = true;
				coluna--;
			} else {
				System.out.println("Entrada invalida. Digite novamente.");
			}
		}
	}

	public void realizarMarcacao() {
		boolean posicaoLivre = hasPosicaoLivre();
		if (!posicaoLivre) {
			System.out.println("Posicao ja usada. Digite novamente.");
		} else {
			tabuleiro[linha][coluna] = sinal;
			qtdJogadas++;
		}
	}

	public boolean hasPosicaoLivre() {
		return tabuleiro[linha][coluna] == ' ';
	}

	public void verificarGanhador() {
		if (ganhouLinha() || ganhouColuna() || ganhouDiagonal()) {
			hasGanhador = true;
			if (sinal == 'X') {
				System.out.println("Jogador 1 ganhou!");
			} else if (sinal == 'O') {
				System.out.println("Jogador 2 ganhou!");
			}

		} else if (qtdJogadas > 9) {
			hasGanhador = true;
			System.out.println("Ninguem ganhou. Deu velha!");
		}
	}

	public boolean ganhouLinha() {
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == sinal && tabuleiro[i][1] == sinal && tabuleiro[i][2] == sinal) {
				return true;
			}
		}
		return false;
	}

	public boolean ganhouColuna() {
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[0][i] == sinal && tabuleiro[1][i] == sinal && tabuleiro[2][i] == sinal) {
				return true;
			}
		}
		return false;
	}

	public boolean ganhouDiagonal() {
		int i = 0;
		if (tabuleiro[i][i] == sinal && tabuleiro[i + 1][i + 1] == sinal && tabuleiro[i + 2][i + 2] == sinal
				|| tabuleiro[i][i + 2] == sinal && tabuleiro[i + 1][i + 1] == sinal && tabuleiro[i + 2][i] == sinal) {
			return true;
		}
		return false;
	}
}
