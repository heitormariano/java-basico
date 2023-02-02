package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double[] notas1 = new double[10];
    double[] notas2 = new double[notas1.length];
    double[] resultados = new double[notas1.length];

    for (int i = 0; i < notas1.length; i++) {
      System.out.println("Digite a nota1 do aluno " + i + " :");
      notas1[i] = scan.nextDouble();
      System.out.println("Digite a nota2 do aluno " + i + " :");
      notas2[i] = scan.nextDouble();

      resultados[i] = (notas1[i] + notas2[i]) / 2;
    }

    System.out.print("Notas 1: ");
    for (double elem : notas1) {
      System.out.print(elem + " ");
    }

    System.out.println();
    System.out.print("Notas 2: ");
    for (double elem : notas2) {
      System.out.print(elem + " ");
    }

    System.out.println();
    System.out.println("Resultados: ");
    for (int i = 0; i < resultados.length; i++) {
      if (resultados[i] >= 7.0) {
        System.out.println("Aluno " + i + " - Nota: " + resultados[i] + " - Resultado: APROVADO");
      } else {
        System.out.println("Aluno " + i + " - Nota: " + resultados[i] + " - Resultado: REPROVADO");
      }
    }
  }
}
