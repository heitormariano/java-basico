package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

// Poucas mudancas relacao a classe Exer06 (Jogo da Velha, aula 20)
public class JogoVelha {
  private char[][] tabuleiro = new char[3][3]; // variavel renomeda para tabuleiro
  private Scanner scan = new Scanner(System.in);
  private int linha, coluna;
  private boolean ganhou;
  private int jogada;
  private char sinal;

  // renomeado o metodo para "iniciarJogo()"
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
        System.out.println("Vez do Jogador 1. Escolha da posicao da marcacao.");
        sinal = 'X';
      } else {
        System.out.println("Vez do Jogador 2. Escolha da posicao da marcacao.");
        sinal = 'O';
      }

      informarLinha();
      informarColuna();

      boolean posicaoLivre = hasPosicaoLivre();
      if (!posicaoLivre) {
        System.out.println("Posicao ja usada, tente novamente.");
      } else {
        tabuleiro[linha][coluna] = sinal;
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
        System.out.println("Entrada invalida, tente novamente.");
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
        System.out.println("Entrada invalida, tente novamente.");
      }
    }
  }

  public void imprimirTabuleiro() {
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro[i].length; j++) {
        System.out.print(tabuleiro[i][j] + " | ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public boolean hasPosicaoLivre() {
    if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
      return false;
    } else {
      return true;
    }
  }

  // metodo recebe o "sinal" (marcacao) do jogador
  public void verificarGanhador(char sinal) {
    if (tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal
        || tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal
        || tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal

        || tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal
        || tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal
        || tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal

        || tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal
        || tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal) {
      ganhou = true;
      if (sinal == 'X') {
        System.out.println("Jogador 1 ganhou!");
      } else if (sinal == 'O') {
        System.out.println("Jogador 2 ganhou!");
      }

    } else if (jogada > 9) {
      ganhou = true;
      System.out.println("Ningu�m ganhou");
    }
  }
}
