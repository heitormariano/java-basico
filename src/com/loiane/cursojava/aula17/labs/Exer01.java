package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		boolean valido = false;

		do {
			System.out.println("Informe um valor entre 0 e 10");
			int valor = scan.nextInt();
			if (valor >= 0 && valor <= 10) {
				valido = true;
				System.out.println("Valor valido: " + valor);
			}
		} while (!valido);
		System.out.println("Fim");
	}
}
