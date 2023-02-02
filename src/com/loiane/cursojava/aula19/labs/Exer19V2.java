package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19V2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int tamanho = 10;
    double[] notas1 = new double[tamanho];
    double[] notas2 = new double[tamanho];
    double[] result = new double[tamanho];
    String[] situacao = new String[tamanho];

    for (int i = 0; i < notas1.length; i++) {
      System.out.println("Digite a nota1 do aluno " + (i + 1) + " :");
      notas1[i] = scan.nextDouble();

      System.out.println("Digite a nota2 do aluno " + (i + 1) + " :");
      notas2[i] = scan.nextDouble();

      result[i] = (notas1[i] + notas2[i]) / 2;
      situacao[i] = result[i] >= 7 ? "Aprovado" : "Reprovado";
    }

    System.out.println();

    for (int i = 0; i < tamanho; i++) {
      System.out.println("Notas e resultado do aluno " + (i + 1) + " :");
      System.out.println("Nota 1: " + notas1[i]);
      System.out.println("Nota 2: " + notas2[i]);
      System.out.println("Media: " + result[i]);
      System.out.println("Resultado final: " + situacao[i]);
      System.out.println();
    }
  }
}