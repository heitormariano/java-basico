package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer24 {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double precoPao;

		System.out.println("Informe o preco de um p�o: ");
		precoPao = scan.nextDouble();

		System.out.println("Pre�o do p�o: " + precoPao);
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os (at� 50 p�es)");

		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) + " - R$ " + precoPao * (i + 1));
		}
	}
}
