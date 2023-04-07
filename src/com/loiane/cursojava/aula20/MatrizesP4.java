package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizesP4 {

  // Matrizes Irregulares
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe o número de pessoas que serão entrevistadas");
    int numEntrevistados = scan.nextInt();

    // o primeiro vetor (dimensão 1) representa os "pais/entrevistados"
    // o segundo vetor (dimensão 2) representa os nomes dos filhos de cada pai
    String[][] nomesFilhos = new String[numEntrevistados][];

    for (int i = 0; i < nomesFilhos.length; i++) {
      System.out.println("Informe a quantidade de filhos do entrevistado " + (i + 1) + " :");
      int qtdFilhos = scan.nextInt();

      // Definição dos vetores para armazenar os nomes dos filhos de cada entrevistado
      // Ex.: nomesFilhos[0] --> contém array/vetor para guardar 3 nomes (qtdFlhos = 3)
      // Ex.: nomesFilhos[1] --> contém array/vetor para guardar 2 nomes (qtdFilhos = 2)
      nomesFilhos[i] = new String[qtdFilhos];
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
