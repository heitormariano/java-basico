package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer18 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int numero;
		int cont = 0;

		System.out.println("Algoritmo Numeros Primos");
		System.out.println("informe um número:");
		numero = scan.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				cont++;
			}
		}
		if (numero == 1 || cont == 2) {
			System.out.println("O numero " + numero + " e PRIMO");
		} else {
			System.out.println("O numero " + numero + " NAO E PRIMO");
		}
	}
}
