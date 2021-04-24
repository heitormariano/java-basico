package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean valido = false;
		int numero;
		System.out.println("Algoritmo Tabuada");
		do {
			System.out.println("Infome o nummero (1 - 10) para ver a tabuada:");
			numero = scan.nextInt();
			if (numero >= 1 && numero <= 10) {
				valido = true;
				System.out.println("A tabuada do numero " + numero);
				for (int i = 1; i < 11; i++) {
					System.out.println(numero + " X " + i + " = " + (numero * i));
				}

			} else {
				System.out.println("O numero para a tabuada deve estar entre 1 e 10. Digite o numero novamente");
			}

		} while (!valido);
	}
}
