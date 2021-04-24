package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int numero;
		int inicio;
		int fim;
		boolean valido = false;

		System.out.println("informe o número para a tabuada:");
		numero = scan.nextInt();

		do {
			System.out.println("Digite o valor inicial: ");
			inicio = scan.nextInt();
			System.out.println("Digite o valor final: ");
			fim = scan.nextInt();
			if (inicio > fim) {
				System.out.println("Valor inicial maior que o final. Digite os dados novamente");
			} else {
				valido = true;
				System.out.println();
				System.out.println("Tabuada de:  " + numero);
				System.out.println("Começa por: " + inicio);
				System.out.println("Termina por: " + fim);
				System.out.println();
				System.out.println("Montando a tabuada de " + numero + " começando em " + inicio + " e terminando em "
						+ fim + " :");
				for (int i = inicio; i <= fim; i++) {

					System.out.println(numero + " X " + i + " = " + numero * i);
				}
			}
		} while (!valido);
	}
}
