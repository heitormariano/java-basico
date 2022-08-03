package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer29V2 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int numero;
		boolean primo;

		System.out.println("Algoritmo números primos");
		System.out.println();

		System.out.println("Informe um número:");
		numero = scan.nextInt();

		System.out.println("lista de número primos (entre 1 e " + numero + ") ");
		for (int i = 1; i <= numero; i++) {
			primo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				System.out.println(i);
			}
		}
	}
}
