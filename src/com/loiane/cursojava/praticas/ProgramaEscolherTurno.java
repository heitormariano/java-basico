package com.loiane.cursojava.praticas;

import java.util.Scanner;

public class ProgramaEscolherTurno {

  private static Scanner scanner;

  public static void main(String[] args) {

    System.out.println("Programa turno");

    scanner = new Scanner(System.in);
    char turno = 'a';

    System.out.println("Informe os turnos da seguinte forma");
    System.out.println("M - Matutino");
    System.out.println("V - Vespertino");
    System.out.println("N - Noturno");
    
    turno = scanner.next().charAt(0);

    switch (turno) {
      case 'M':
      case 'm':
        System.out.println("Turno matutino escolhido");
        break;

      case 'V':
      case 'v':
        System.out.println("Turno vespertino escolhido");
        break;

      case 'N':
      case 'n':
        System.out.println("Turno noturno escolhido");
        break;

      default:
        System.out.println("Opcao invalida");
        break;
    }
  }
}
