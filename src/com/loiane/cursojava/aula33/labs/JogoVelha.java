package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class JogoVelha {
	private char[][] jogoVelha;
	private Scanner scan;
	private int linha, coluna;
	private boolean ganhou;
	private int jogada;
	private char sinal;

	public JogoVelha() {
		this.jogoVelha = new char[3][3];
		this.scan = new Scanner(System.in);

		this.linha = 0;
		this.coluna = 0;
		this.ganhou = false;
		this.jogada = 1;
	}

	public char[][] getJogoVelha() {
		return jogoVelha;
	}

	public void setJogoVelha(char[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public boolean isGanhou() {
		return ganhou;
	}

	public void setGanhou(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	public char getSinal() {
		return sinal;
	}

	public void setSinal(char sinal) {
		this.sinal = sinal;
	}

	public void iniciarJogo() {
		System.out.println("Jogo da Velha Master");
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");

		while (!ganhou) {
			if (jogada % 2 == 1) {
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
			verificarGanhador(sinal);
		}
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
				System.out.println("Entrada inválida, tente novamente.");
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
				System.out.println("Entrada inválida, tente novamente.");
			}
		}
	}

	public void imprimirTabuleiro() {
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean hasPosicaoLivre() {
		if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
			return false;
		} else {
			return true;
		}
	}

	public void verificarGanhador(char sinal) {
		if (jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal
				|| jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal
				|| jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal

				|| jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal
				|| jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal
				|| jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal

				|| jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal
				|| jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal) {
			ganhou = true;
			if (sinal == 'X') {
				System.out.println("Jogador 1 ganhou!");
			} else if (sinal == 'O') {
				System.out.println("Jogador 2 ganhou!");
			}

		} else if (jogada > 9) {
			ganhou = true;
			System.out.println("Ninguém ganhou");
		}
	}
}
