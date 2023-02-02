package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class JogoVelhaV2 {
	static Scanner sc = new Scanner(System.in);
	static char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static int qtdJogadas = 0;

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao Jogo da Velha!");
		System.out.println("Tabuleiro apresenta 3 linhas e 3 colunas\n");

		System.out.println("Jogador 1: X");
		System.out.println("Jogador 2: O\n");

		while (qtdJogadas < 9) {
			realizarMarcacaoJogador(qtdJogadas % 2 == 0 ? 'X' : 'O');
			qtdJogadas++;

			if (verificarGanhador('X')) {
				System.out.println("Jogador 1 venceu!");
				break;
			}
			if (verificarGanhador('O')) {
				System.out.println("Jogador 2 venceu!");
				break;
			}
		}
		if (qtdJogadas == 9) {
			System.out.println("Deu velha! Nenhum vencedor");
		}
	}

	private static void realizarMarcacaoJogador(char sinalMarcacao) {
		int linha;
		int coluna;
		boolean valido = false;

		System.out.println("Jogador " + (sinalMarcacao == 'X' ? 1 : 2) + " jogando...");
		do {
			System.out.println("Digite as coordenadas da jogada (linha e coluna):");
			linha = sc.nextInt() - 1;
			coluna = sc.nextInt() - 1;

			if (!isLinhaColunaValida(linha, coluna)) {
				System.out.println("Linha e/ou coluna inválidos. Escolha valores entre 1 e 3");
			} else if (isPosicaoOcupada(linha, coluna)) {
				System.out.println("Posição já preenchida. Escolha outra");
			} else {
				valido = true;
			}
		} while (!valido);

		tabuleiro[linha][coluna] = sinalMarcacao;
		imprimirTabuleiro();
	}

	private static void imprimirTabuleiro() {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + tabuleiro[i][j] + " |");
			}
			System.out.println();
			System.out.println("---+---+---");
		}
		System.out.println();
	}

	private static boolean verificarGanhador(char sinalMarcacao) {
		boolean retorno = false;

		// verificação das linhas e colunas
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == sinalMarcacao && tabuleiro[i][1] == sinalMarcacao
					&& tabuleiro[i][2] == sinalMarcacao) {
				retorno = true;
			}
			if (tabuleiro[0][i] == sinalMarcacao && tabuleiro[1][i] == sinalMarcacao
					&& tabuleiro[2][i] == sinalMarcacao) {
				retorno = true;
			}
		}

		// verificação das diagonais
		int i = 0;
		if (tabuleiro[i][i] == sinalMarcacao && tabuleiro[i + 1][i + 1] == sinalMarcacao
				&& tabuleiro[i + 2][i + 2] == sinalMarcacao) {
			retorno = true;
		} else if (tabuleiro[i][i + 2] == sinalMarcacao && tabuleiro[i + 1][i + 1] == sinalMarcacao
				&& tabuleiro[i + 2][i] == sinalMarcacao) {
			retorno = true;
		}

		return retorno;
	}

	private static boolean isLinhaColunaValida(int linha, int coluna) {
		boolean linhaValida = false;
		boolean colunaValida = false;

		if (linha >= 0 && linha <= 3) {
			linhaValida = true;
		}

		if (coluna >= 0 && coluna <= 3) {
			colunaValida = true;
		}

		return linhaValida && colunaValida;
	}

	private static boolean isPosicaoOcupada(int linha, int coluna) {
		return tabuleiro[linha][coluna] != ' ';
	}
}
