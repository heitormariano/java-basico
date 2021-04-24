package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		//amadurecer a minha ideia (permitir que o usuario informe 0 para finalizar. Imprirmir a tabela seguindo o modelo.
		//utilizar a ideia de concater uma variável do tipo String (output) para manter o texto final (tabela de informações). 
		//Essa variável será impressa no final
		
		double precoProd;
		double total = 0;
		double dinheiroCliente;
		double troco;
		
		char continuar;
		boolean sair = false;
		boolean valido = false;
		
		String output = "Tabela com Informações da compra\n";
		System.out.println("Lojas Tabajara - Caixa Registradora simples");

		do {
			System.out.println("Deseja fazer uma compra?");
			System.out.println("(Obs.: Informe 's' - SIM ou 'n' - NÃO)");
			continuar = scan.next().charAt(0);

			if (continuar == 's') {
				// continuar
				int count = 1;
				do {
					System.out.println("Informe o valor do produto: " + count + " : ");
					precoProd = scan.nextDouble();

					if (precoProd != 0) {
						output += "Produto " + count + " : R$ " + precoProd + "\n";
						total += precoProd;
						count++;
					} else {
						valido = true;
						output += "Produto " + count + " : R$ " + precoProd + "\n";

						System.out.println("Fim da compra. Valor total: " + total);
						System.out.println("Informe o dinheiro para o pagamento:");
						dinheiroCliente = scan.nextDouble();
						troco = dinheiroCliente - total;

						System.out.println("Fim Compra");
						System.out.println();

						output += "Total: " + total + "\n" + "Dinheiro recebido: " + dinheiroCliente + "\n" + "Troco: "
								+ troco + "\n";
						System.out.println(output);
					}
				} while (!valido);
			} else {
				sair = true;
				System.out.println("Fim execução.");
			}

		} while (!sair);
		
	}
}
