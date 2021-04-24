package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer24 {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double precoPao;

		System.out.println("Informe o preco de um pão: ");
		precoPao = scan.nextDouble();

		System.out.println("Preço do pão: " + precoPao);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços (até 50 pães)");

		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) + " - R$ " + precoPao * (i + 1));
		}
	}
}
