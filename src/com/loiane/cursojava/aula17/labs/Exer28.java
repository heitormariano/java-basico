package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer28 {
	private static Scanner scan = new Scanner(System.in);

	//Idêntico ao exercício 18
	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int numero;
		boolean primo = true;

		System.out.println("Algoritmo Números Primos - Exercício 28");
		System.out.println();

		System.out.println("Informe um número:");
		numero = scan.nextInt();

		//foram desconsiderados como valores do i o número 1 e o próprio número informado
		//Dessa forma, caso o número seja divisível por outros números, ele não é primo
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("Nao é primo - divisível por: " + i);
				primo = false;
				// break;
			}
		}
		if (primo) {
			System.out.println("Numero PRIMO");
		}
	}
}
