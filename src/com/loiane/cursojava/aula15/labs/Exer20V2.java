package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20V2 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Perguntas de investigacao. Responda 'sim' ou 'nao'");

		System.out.println("Telefonou para a vítima?");
		String resp1 = scan.next();

		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();

		System.out.println("Mora perto da vítima?");
		String resp3 = scan.next();

		System.out.println("Devia para a vítima?");
		String resp4 = scan.next();

		System.out.println("Já trabalhou com a vítima?");
		String resp5 = scan.next();

		int cont = 0;
		if (resp1.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("sim")) {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Voce e SUSPEITO");
		} else if (cont == 2 && cont == 5) {
			System.out.println("Voce e CUMPLICE");
		} else if (cont == 5) {
			System.out.println("voce e o ASSASSINO");
		} else {
			System.out.println("Voce e INOCENTE");
		}
	}
}
