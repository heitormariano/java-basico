package com.loiane.cursojava.praticas;

import java.util.Scanner;

public class LeituraDados {

  private static Scanner scan;

  public static void main(String[] args) {

    scan = new Scanner(System.in);

    System.out.println("Sistema de dados pessoais");

    System.out.println("Informe o seu nome:");
    String nome = scan.nextLine();

    System.out.println("Informe a sua idade:");
    int idade = scan.nextInt();

    System.out.println("Informe a sua altura (use v�rgula como separador)");
    float altura = scan.nextFloat();

    System.out.println("Voc� � casado? Use \"sim\" ou \"nao\"?");
    String resposta = scan.next();
    String estadoCivil = resposta.equalsIgnoreCase("sim") ? "Casado" : "Solteiro";

    System.out.println("Resumo das informa��es obtidas:");
    System.out.printf("Nome: %s%n", nome);
    System.out.printf("Idade: %d%n", idade);
    System.out.printf("Altura: %.2f%n", altura);
    System.out.printf("Estado Civil: %s%n", estadoCivil);

  }
}
