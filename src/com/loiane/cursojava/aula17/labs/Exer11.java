package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean valido = false;
		int inicio;
		int fim;
		int soma = 0;

		do {
			System.out.println("Informe o numero 1:");
			int num01 = scan.nextInt();
			System.out.println("Informe o numero 2:");
			int num02 = scan.nextInt();

			if (num01 != num02) {
				valido = true;
				if (num01 < num02) {
					inicio = num01;
					fim = num02;
				} else {
					inicio = num02;
					fim = num01;
				}

				System.out.println("Os numeros entre " + inicio + " e " + fim + " sao:");
				for (int i = inicio + 1; i < fim; i++) {
					soma += i;
					System.out.println(i);
				}
				System.out.println("A soma dos numeros: " + soma);
			} else {
				System.out.println("Os numeros precisam ser diferentes. Digite os valores novamente.");
			}

		} while (!valido);
	}
}
