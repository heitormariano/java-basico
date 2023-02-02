package com.loiane.cursojava.aula17.labs;

public class Exer06 {

  public static void main(String[] args) {

    // imprimnindo os numeros (um abaixo do outro)
    for (int i = 1; i <= 20; i++) {
      System.out.println(i);

    }

    System.out.println();

    // imprimindo os números um do lado do outro (na mesma linha)
    for (int i = 1; i <= 20; i++) {
      System.out.print(i + " ");
    }

    System.out.println("\n");

    // imprimindo em pares
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " - ");
      } else {
        System.out.println(i);
      }

    }
  }
}
