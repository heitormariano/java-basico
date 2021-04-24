package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {
	private static final double PRECO_ALCOOL = 1.90;
	private static final double PRECO_GASOLINA = 2.50;
	private static Scanner scan;
	private static double totalPago;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Algoritmo Abastecimento");

		System.out.println("Escolha o tipo de combustivel:");
		System.out.println("A - Alcool");
		System.out.println("G - Gasolina");
		String combustivel = scan.next();

		if (combustivel.equalsIgnoreCase("A") || combustivel.equalsIgnoreCase("G")) {
			System.out.println("Quantidade de litros para o veiculo:");
			int qtdLitros = scan.nextInt();

			double preco_desconto = 0.0;

			switch (combustivel) {
			case "A":
			case "a":
				if (qtdLitros < 20) {
					preco_desconto = PRECO_ALCOOL - (PRECO_ALCOOL * 0.03);
					totalPago = preco_desconto * qtdLitros;
				} else if (qtdLitros >= 20) {
					preco_desconto = PRECO_ALCOOL - (PRECO_ALCOOL * 0.05);
					totalPago = preco_desconto * qtdLitros;
				}
				break;
			case "G":
			case "g":
				if (qtdLitros < 20) {
					preco_desconto = PRECO_GASOLINA - (PRECO_GASOLINA * 0.04);
					totalPago = preco_desconto * qtdLitros;
				} else if (qtdLitros >= 20) {
					preco_desconto = PRECO_GASOLINA - (PRECO_GASOLINA * 0.06);
					totalPago = preco_desconto * qtdLitros;
				}
				break;
			}
			System.out.println("Total pago pelo cliente: R$ " + totalPago);

		} else {
			System.out.println("Opcao invalida para o tipo de Combustivel");
		}
	}
}
