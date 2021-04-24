package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer29 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int numero;
		int cont = 0;

		System.out.println("Algoritmo Números Primos");
		System.out.println();

		System.out.println("Informe um número:");
		numero = scan.nextInt();

		// 2, 4, 7, 9
		System.out.println("lista de número primos:");
		System.out.println("1");
		for (int i = 2; i <= numero; i++) { //
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cont++;
				}
			}
			if (cont == 2) {
				System.out.println(i);
			}
			cont = 0;
		}
	}
}
