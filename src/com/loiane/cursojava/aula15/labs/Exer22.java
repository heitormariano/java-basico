package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {
	private static Scanner scan;
	private static double compraMorango;
	private static double compraMaca;
	private static double totalCompra;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Algoritmo pagamento frutas");
		System.out.println("Quantos Kg de Morango?");
		double kgMorango = scan.nextDouble();

		if (kgMorango < 5) {
			compraMorango = kgMorango * 2.5;
		} else if (kgMorango >= 5) {
			compraMorango = kgMorango * 2.2;
		}

		System.out.println("Quantos Kg de Maca?");
		double kgMaca = scan.nextDouble();

		if (kgMaca < 5) {
			compraMaca = kgMaca * 1.8;
		} else if (kgMaca >= 5) {
			compraMaca = kgMaca * 1.5;
		}

		totalCompra = compraMorango + compraMaca;

		if ((kgMorango + kgMaca) > 8 || totalCompra > 25.0) {
			totalCompra = totalCompra - totalCompra * 0.10;
		}

		System.out.println("Valor na compra dos morangos: " + compraMorango);
		System.out.println("Valor na compra dos macas: " + compraMaca);
		System.out.println("Valor total das compras: " + totalCompra);
	}
}
