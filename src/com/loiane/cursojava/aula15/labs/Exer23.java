package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {
	private static Scanner scan;

	private static double precoFileDuplo;
	private static double precoAlcatra;
	private static double precoPicanha;

	private static String tipoCarne;
	private static double kgCarne;
	private static double totalCompra;
	private static String tipoPagamento;
	private static double valorDesconto;
	private static double valorFinalCompra;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Hipermercado Tabajara - Promocao de Carnes");

		System.out.println("Escolha apenas um tipo de carne entre as opções listadas:");
		System.out.println("(Obs.: Digite o número correspondente a carne desejada)");
		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int opcaoCarne = scan.nextInt();

		if (opcaoCarne == 1 || opcaoCarne == 2 || opcaoCarne == 3) {
			if (opcaoCarne == 1) {
				tipoCarne = "File Duplo";
			} else if (opcaoCarne == 2) {
				tipoCarne = "Alcatra";
			} else if (opcaoCarne == 3) {
				tipoCarne = "Picanha";
			}

			System.out.println("Qual a quantidade (kg) deseja comprar?");
			kgCarne = scan.nextDouble();

			if (kgCarne < 5) {
				switch (opcaoCarne) {
				case 1:
					precoFileDuplo = 4.9;
					totalCompra = kgCarne * precoFileDuplo;
					break;
				case 2:
					precoAlcatra = 5.9;
					totalCompra = kgCarne * precoAlcatra;
					break;
				case 3:
					precoPicanha = 6.9;
					totalCompra = kgCarne * precoPicanha;
					break;
				}
			} else if (kgCarne >= 5) {
				switch (opcaoCarne) {
				case 1:
					precoFileDuplo = 5.8;
					totalCompra = kgCarne * precoFileDuplo;
					break;
				case 2:
					precoAlcatra = 6.8;
					totalCompra = kgCarne * precoAlcatra;
					break;
				case 3:
					precoPicanha = 7.8;
					totalCompra = kgCarne * precoPicanha;
					break;
				}
			}

			System.out.println("Escolha a forma de pagamento:");
			System.out.println("1 - Dinheiro");
			System.out.println("2 - Cartao Tabajara");
			int opcaoPagamento = scan.nextInt();

			if (opcaoPagamento == 1) {
				tipoPagamento = "Dinheiro";
				valorDesconto = 0.0;
				valorFinalCompra = totalCompra;
			} else if (opcaoPagamento == 2) {
				tipoPagamento = "Cartao Tabajara";
				valorDesconto = totalCompra * 0.05;
				valorFinalCompra = totalCompra - valorDesconto;
			}

			System.out.println("Impressao do Cupom Fiscal");
			System.out.println("Tipo de Carne: " + tipoCarne);
			System.out.println("Quantidade comprada: " + kgCarne + " Kg");
			System.out.println("Total da Compra: R$ " + totalCompra);
			System.out.println("Tipo de Pagamento : " + tipoPagamento);
			System.out.println("Desconto obtido: R$ " + valorDesconto);
			System.out.println("Valor final da compra: R$ " + valorFinalCompra);
			// System.out.printf("%.2f", valorDesconto); //uso de printf
			// (impressao seguindo um formato)
			// System.out.println();

		} else {
			System.out.println("Opcao invalida");
		}
	}
}