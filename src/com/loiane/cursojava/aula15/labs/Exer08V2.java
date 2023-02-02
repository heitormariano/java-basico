package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08V2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor do produto 1:");
    double valor01 = scan.nextDouble();

    System.out.println("Digiteo o valor do produto 2:");
    double valor02 = scan.nextDouble();

    System.out.println("Digiteo o valor do produto 3:");
    double valor03 = scan.nextDouble();

    double valorProdMenorPreco = valor01;
    String nomeProdMenorPreco = "Produto 1";

    if (valorProdMenorPreco > valor02) {
      valorProdMenorPreco = valor02;
      nomeProdMenorPreco = "Produto 2";
    }

    if (valorProdMenorPreco > valor03) {
      valorProdMenorPreco = valor03;
      nomeProdMenorPreco = "Produto 3";
    }

    System.out.println("Compre o " + nomeProdMenorPreco);
    System.out.println("Valor " + nomeProdMenorPreco + ": " + valorProdMenorPreco);
  }
}