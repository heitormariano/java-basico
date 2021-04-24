package com.loiane.cursojava.aula52.labs.correcao;

import java.util.Scanner;

public class Teste {
	private static Agenda agenda;
	private static Scanner scan;

	public static void main(String[] args) {
		agenda = new Agenda();
		scan = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu();
			if (opcao == 1) {
				consultarContato();
			} else if (opcao == 2) {
				adicionarContato();
			}
		}
	}

	public static int obterOpcaoMenu() {
		int opcao = -1;
		boolean entradaValida = false;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1 - Pesquisar Contato");
			System.out.println("2 - Adicionar Contato");
			System.out.println("0 - Sair");
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 0 || opcao == 1 || opcao == 2) {
					entradaValida = true;
				} else {
					throw new Exception("Opção inválida");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida. Digite Novamente.");
			}
		}
		return opcao;
	}

	public static String lerInformacaoString(String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static void adicionarContato() {

		System.out.println("Informe os dados do contato");

		String nome = lerInformacaoString("Nome: ");
		String tel = lerInformacaoString("Telefone: ");
		String email = lerInformacaoString("E-mail: ");

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(tel);
		contato.setEmail(email);

		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da Agenda:");
			System.out.println(agenda);
			System.out.println();
		}
	}

	public static void consultarContato() {

		String nomeContato = lerInformacaoString("Informe o nome do Contato para a pesquisa");
		try {
			int indice = agenda.consultarContato(nomeContato);
			if (indice >= 0) {
				System.out.println("Contato Existe");
				Contato contato = agenda.consultarContato(indice);
				System.out.println("Dados do contato::");
				System.out.println(contato);
				System.out.println();
			}
		} catch (ContatoNaoExisteException | IndiceInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
