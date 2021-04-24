package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class JogoVelha {
	// não foram feitas muitas mudanças na classe Exer06 (Jogo da Velha, aula 20)
	private char[][] jogoVelha = new char[3][3]; // variável renomeda para tabuleiro
	private Scanner scan = new Scanner(System.in);
	private int linha, coluna;
	private boolean ganhou;
	private int jogada;
	private char sinal;

	// renomeado o método para "iniciarJogo()"
	public void iniciarJogo() {
		linha = 0;
		coluna = 0;
		ganhou = false;
		jogada = 1;

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

	//método recebe o "sinal" (marcação) do jogador
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
			if(sinal == 'X'){
				System.out.println("Jogador 1 ganhou!");
			}else if(sinal == 'O'){
				System.out.println("Jogador 2 ganhou!");
			}

		} else if (jogada > 9) {
			ganhou = true;
			System.out.println("Ninguém ganhou");
		}
	}
}
