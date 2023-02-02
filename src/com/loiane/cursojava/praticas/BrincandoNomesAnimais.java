package com.loiane.cursojava.praticas;

import java.util.Scanner;

public class BrincandoNomesAnimais {

  private static Scanner scann;

  public static void main(String[] args) {
    scann = new Scanner(System.in);

    System.out.println("Analisando tipos de animais");

    System.out.println("Informe o nome de um animal conforme opcoes a seguir:");
    System.out.println("1 - Cachorro");
    System.out.println("2 - Gato");
    System.out.println("3 - Tigre");
    System.out.println("4 - Jacare");

    String animal = scann.next().toUpperCase();

    switch (animal) {
      case "CACHORRO":
        System.out.println("Cachorro - animal domestico");
        break;

      case "GATO":
        System.out.println("Gato - animal domestico");
        break;

      case "TIGRE":
        System.out.println("Tigre - animal selvagem");
        break;

      case "JACARE":
        System.out.println("Jacare - animal selvagem");
        break;

      default:
        System.out.println("Animal fora da relacao");
        break;
    }

  }

}
