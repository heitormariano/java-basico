package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23V2 {

	private static Scanner sc;
	private static String nomecarne;
	private static byte tipoCarne;
	private static double kgCarne;
	private static double precoCarne;
	private static String tipoPagamento;
	private static double totalCompra;
	private static double desconto;
	private static double taxaDesconto;
	private static double valorFinal;
	private static boolean sair;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		sair = false;

		while (!sair) {
			System.out.println("Sistema de compra de Carnes");
			System.out.println("Digite uma das opções a seguir:");
			System.out.println("0 - Sair do Programa");
			System.out.println("1 - Iniciar compra Carne");
			byte opcao = sc.nextByte();
			if (opcao == 1) {
				System.out.println("Informe o tipo de carne que deseja comprar");
				System.out.println("1 - Filé");
				System.out.println("2 - Alcatra");
				System.out.println("3 - Picanha");
				byte opcaoCarne = sc.nextByte();
				switch (opcaoCarne) {
				case 1:
					nomecarne = "Filé";
					tipoCarne = 1;
					break;
				case 2:
					nomecarne = "Alcatra";
					tipoCarne = 2;
					break;
				case 3:
					nomecarne = "Picanha";
					tipoCarne = 3;
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}

				System.out.println("Informe a quantidade (em Kg) desejada");
				kgCarne = sc.nextDouble();

				System.out.println("Informe a forma de pagamento:");
				System.out.println("1 - Dinheiro");
				System.out.println("2 - Cartão Tabajara (5% de desconto)");
				byte opcaoPagamento = sc.nextByte();

				switch (opcaoPagamento) {
				case 1:
					tipoPagamento = "Dinheiro";
					taxaDesconto = 0;
					break;
				case 2:
					tipoPagamento = "Cartão Tabajara";
					taxaDesconto = 0.05;
					break;
				default:
					System.out.println("Opção Inválida");
					break;
				}

				if (kgCarne < 5) {
					switch (tipoCarne) {
					case 1:
						precoCarne = 4.9;
						break;
					case 2:
						precoCarne = 5.9;
						break;
					case 3:
						precoCarne = 6.9;
						break;
					}
				} else {
					switch (tipoCarne) {
					case 1:
						precoCarne = 5.8;
						break;
					case 2:
						precoCarne = 6.8;
						break;
					case 3:
						precoCarne = 7.8;
						break;
					}
				}

				totalCompra = kgCarne * precoCarne;
				desconto = totalCompra * taxaDesconto;
				valorFinal = totalCompra - desconto;

				System.out.println("Imprimindo Dados da Compra:");
				System.out.println("Tipo da Carne: " + nomecarne);
				System.out.println("Quantidade comprada: " + kgCarne);
				System.out.println("Total Compra (valor bruto): " + totalCompra);
				System.out.println("Forma de Pagamento: " + tipoPagamento);
				System.out.printf("Desconto obtido: %.2f", desconto);
				System.out.println();
				System.out.println("Valor final (a receber): " + valorFinal);
				System.out.println();

			} else if (opcao == 0) {
				sair = true;
				System.out.println("Programa Encerrado");
			} else {
				System.out.println("Opção inválida. Informe uma das opções apresentadas");
			}
		}
	}

}
