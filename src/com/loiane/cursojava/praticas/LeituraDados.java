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

    System.out.println("Informe a sua altura (use vírgula como separador)");
    float altura = scan.nextFloat();

    System.out.println("Você é casado? Use \"sim\" ou \"nao\"?");
    String resposta = scan.next();
    String estadoCivil = resposta.equalsIgnoreCase("sim") ? "Casado" : "Solteiro";

    System.out.println("Resumo das informações obtidas:");
    System.out.printf("Nome: %s%n", nome);
    System.out.printf("Idade: %d%n", idade);
    System.out.printf("Altura: %.2f%n", altura);
    System.out.printf("Estado Civil: %s%n", estadoCivil);

  }
}
