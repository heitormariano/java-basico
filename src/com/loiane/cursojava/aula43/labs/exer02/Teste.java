package com.loiane.cursojava.aula43.labs.exer02;

import java.util.Scanner;

public class Teste {

	private static ReceitaFederal receitaFederal;
	private static Scanner scan;

	public static void main(String[] args) {
		receitaFederal = new ReceitaFederal(6);
		scan = new Scanner(System.in);

		int opcao = -1;
		do {
			System.out.println("Banco True - Escolha uma opção:");
			System.out.println("1 - Adicionar Contribuinte");
			System.out.println("2 - Buscar Contribuinte (pelo índice)");
			System.out.println("3 - Remover Contribuinte (pelo índice)");
			System.out.println("4 - Imprimir os Dados dos Contribuintes");
			System.out.println("0 - Encerrar o programa");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Fim do programa.");
				break;
			case 1:
				adicionarContribuinte();
				break;
			case 2:
				buscarContribuinte();
				break;
			case 3:
				removerContribuinte();
				break;
			case 4:
				System.out.println(imprimirDadosContribuintes());
				System.out.println();
				break;
			}

		} while (opcao != 0);
	}

	public static void adicionarContribuinte() {
		Contribuinte contribuinte = null;

		System.out.println("Informe o tipo de contribuinte:");
		System.out.println("1 - Pessoa física");
		System.out.println("2 - Pessoa jurídica");

		int opcao = scan.nextInt();

		if (opcao == 1 || opcao == 2) {
			if (opcao == 1) {
				contribuinte = new PessoaFisica();
			} else if (opcao == 2) {
				contribuinte = new PessoaJuridica();
			}
			System.out.println("Informe o nome:");
			scan.nextLine();
			String nome = scan.nextLine();
			contribuinte.setNome(nome);
			
			if(contribuinte instanceof PessoaFisica){
				System.out.println("Informe o CPF:");
				String cpf = scan.nextLine();
				((PessoaFisica) contribuinte).setCpf(cpf);
				
			}else if(contribuinte instanceof PessoaJuridica){
				System.out.println("Informe o CNPJ:");
				String cnpj = scan.nextLine();
				((PessoaJuridica) contribuinte).setCnpj(cnpj);
			}

			System.out.println("Informe a renda bruta:");
			double rendaBruta = scan.nextDouble();
			contribuinte.setRendaBruta(rendaBruta);

			try {
				receitaFederal.adicionarContribuinte(contribuinte);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		} else {
			System.out.println("opção Inválida. Tente novamente.");
		}

	}

	public static void buscarContribuinte() {
		System.out.println("Informe o índice do Contribuinte:");
		int posicao = scan.nextInt();
		Contribuinte contribuinte = receitaFederal.buscarContribuinte(posicao);

		if (contribuinte != null) {
			System.out.println("Contribuinte encontrado");
			System.out.println("Nome:" + contribuinte.getNome());
			System.out.println("Renda Bruta: " + contribuinte.getRendaBruta());
		} else
			System.out.println("Constribuinte não encontrado");
	}

	public static void removerContribuinte() {
		System.out.println("Informe o índice do Contribuinte:");
		int posicao = scan.nextInt();

		boolean resultado = receitaFederal.removerContribuinte(posicao);
		if (resultado) {
			System.out.println("Contribuinte de posicao " + posicao + " excluído");
		} else {
			System.out.println("Erro durante a operação de remoção");
		}
	}

	public static String imprimirDadosContribuintes() {
		String dadosContribuintes = receitaFederal.imprimirDadosContribuintes();
		return dadosContribuintes;
	}
}
