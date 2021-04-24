package com.loiane.cursojava.aula43.labs.exer01;

import java.util.Scanner;

public class Teste {
	private static ContaBancaria conta;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;
		do {
			System.out.println("Banco True - Escolha uma opção:");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Sacar valor");
			System.out.println("3 - Depositar dinheiro");
			System.out.println("4 - Mostrar saldo");
			System.out.println("5 - Mostrar novo saldo (passando taxa de rendimento)");
			System.out.println("6 - Mostrar dados da conta");
			System.out.println("0 - Encerrar o programa");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Fim do programa.");
				break;
			case 1:
				System.out.println("Informe o tipo de Conta");
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Especial");

				int tipoConta = scan.nextInt();

				if (tipoConta == 1) {
					conta = new ContaPoupanca();

				} else if (tipoConta == 2) {
					conta = new ContaEspecial();
				}

				System.out.println("Informe o titular da conta:");
				scan.nextLine();
				String nome = scan.nextLine();
				conta.setNomeCliente(nome);

				System.out.println("Número da conta:");
				String numero = scan.nextLine();
				conta.setNumConta(numero);

				System.out.println("Informe o saldo:");
				double saldo = scan.nextDouble();
				conta.setSaldo(saldo);

				if (conta instanceof ContaEspecial) {
					System.out.println("Informe o limite:");
					double limite = scan.nextDouble();
					((ContaEspecial) conta).setLimite(limite);
				} else if (conta instanceof ContaPoupanca) {
					System.out.println("Informe o dia para os rendimentos da conta");
					int diaRendimento = scan.nextInt();
					((ContaPoupanca) conta).setDiaRendimento(diaRendimento);
				}

				break;
			case 2:
				System.out.println("informe o valor do saque:");
				double saque = scan.nextDouble();
				if (conta != null) {
					conta.sacar(saque);
				} else {
					System.out.println("Não existe conta para saque");
				}
				break;
			case 3:
				System.out.println("informe o valor do depósito:");
				double deposito = scan.nextDouble();
				if (conta != null) {
					conta.depositar(deposito);
				} else {
					System.out.println("Não existe conta para depósito");
				}
				break;
			case 4:
				if (conta != null) {
					System.out.println("Saldo da conta: " + conta.obterSaldo());
				} else {
					System.out.println("Não existe conta para obter saldo");
				}
				break;
			case 5:
				if (conta instanceof ContaPoupanca) {
					System.out.println("Informe taxa de rendimento:");
					double taxa = scan.nextDouble();
					boolean resultado = ((ContaPoupanca) conta).calcularNovoSaldo(taxa);
					if (resultado) {
						System.out.println("Novo saldo calculado. Dia de rendimento coincide com o dia de hoje");
						System.out.println("Novo saldo da conta: " + conta.getSaldo());
						System.out.println();
					} else {
						System.out.println(
								"Novo saldo não pode ser calculado. " + "Dia de rendimento diferente do dia de hoje");
					}

				} else {
					System.out.println("A conta criada não é uma conta poupança");
				}
				break;
			case 6:
				if (conta != null) {
					System.out.println("Dados da conta criada:");
					System.out.println(conta);
				} else {
					System.out.println("Crie uma conta primeiro e repita a operação");
				}
				break;
			}

		} while (opcao != 0);
	}
}
