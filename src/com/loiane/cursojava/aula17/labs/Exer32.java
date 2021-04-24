package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		boolean sair = false;
		boolean valido = false;
		String opcao;

		int codItem;
		int qtdItem = 0;
		String nomeItem = "";
		double precoItem;
		double totalItem = 0;
		double totalGeral = 0;

		String output = "-- Detalhes do Pedido --\n";

		do {
			System.out.println("Lanchonete Supimpation");
			System.out.println("Gostaria de fazer um pedido?");
			System.out.println("Escolha: s (Sim) ou n (Não)");
			opcao = scan.next();
			if (opcao.equalsIgnoreCase("s")) {
				imprimirMenu();
				do {
					System.out.println("Informe o código do item ou 0 para encerrar:");
					codItem = scan.nextInt();
					if (codItem != 0) {
						switch (codItem) {
						case 100:
							nomeItem = "Cachorro Quente";
							precoItem = 1.20;

							qtdItem = informarQuantidadeItem(scan);
							totalItem = precoTotalItem(precoItem, qtdItem);

							totalGeral += totalItem;
							output += detalhesItem(nomeItem, qtdItem, totalItem);
							break;
						case 101:
							nomeItem = "Bauru Simples";
							precoItem = 1.30;

							qtdItem = informarQuantidadeItem(scan);
							totalItem = precoTotalItem(precoItem, qtdItem);
							totalGeral += totalItem;
							output += detalhesItem(nomeItem, qtdItem, totalItem);
							break;
						case 102:
							nomeItem = "Bauru com ovo";
							precoItem = 1.50;

							qtdItem = informarQuantidadeItem(scan);
							totalItem = precoTotalItem(precoItem, qtdItem);
							totalGeral += totalItem;
							output += detalhesItem(nomeItem, qtdItem, totalItem);
							break;
						case 103:
							nomeItem = "Hambúrguer";
							precoItem = 1.20;

							qtdItem = informarQuantidadeItem(scan);
							totalItem = precoTotalItem(precoItem, qtdItem);
							totalGeral += totalItem;
							output += detalhesItem(nomeItem, qtdItem, totalItem);
							break;
						case 104:
							nomeItem = "Cheeseburguer";
							precoItem = 1.30;

							qtdItem = informarQuantidadeItem(scan);
							totalItem = precoTotalItem(precoItem, qtdItem);
							totalGeral += totalItem;
							output += detalhesItem(nomeItem, qtdItem, totalItem);
							break;
						case 105:
							nomeItem = "Refrigerante";
							precoItem = 1.00;

							qtdItem = informarQuantidadeItem(scan);
							totalItem = precoTotalItem(precoItem, qtdItem);
							totalGeral += totalItem;
							output += detalhesItem(nomeItem, qtdItem, totalItem);
							break;

						default:
							System.out.println("Código incorreto. Por favor, digite um código válido.");
							break;
						}

					} else if (codItem == 0) {
						valido = true;
						System.out.println("Fim do Pedido \n");
						output += "Total Geral: " + totalGeral + "\n";
						System.out.println(output);
					}

				} while (!valido);

			} else if (opcao.equalsIgnoreCase("n")) {
				sair = true;
				System.out.println("Programa Encerrado.");
			}
		} while (!sair);

	}

	private static void imprimirMenu() {
		System.out.println("   ESPECIFICAÇÃO   CÓDIGO   PREÇO ");
		System.out.println(" * Cachorro Quente  100     R$ 1,20");
		System.out.println(" * Bauru Simples    101     R$ 1,30");
		System.out.println(" * Bauru com ovo    102     R$ 1,50");
		System.out.println(" * Hambúrguer       103     R$ 1,20");
		System.out.println(" * Cheeseburguer    104     R$ 1,30");
		System.out.println(" * Refrigerante     105     R$ 1,00");
		System.out.println();
	}

	private static int informarQuantidadeItem(Scanner scan) {
		int qtdItem = 0;
		System.out.println("Informe a quantidade desejada: ");
		qtdItem = scan.nextInt();
		return qtdItem;
	}

	private static double precoTotalItem(double preco, int qtd) {
		return preco * qtd;
	}

	private static String detalhesItem(String nomeItem, double qtdItem, double totalItem) {
		String detalhesItem = "";
		detalhesItem = nomeItem + " - Quantidade Pedida: " + qtdItem + " - Valor total: " + totalItem + "\n";
		return detalhesItem;
	}
}
