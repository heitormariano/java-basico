package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int numero;
		int qtdPares = 0;
		int qtdImpares = 0;

		System.out.println("informe 10 números:");
		for (int i = 0; i < 10; i++) {
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}
		}
		System.out.println("Quantidade de numeros pares: " + qtdPares);
		System.out.println("Quantidade de numeros impares: " + qtdImpares);
	}
}
