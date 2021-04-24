package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {
	private static Agenda agenda;
	private static Scanner scan;

	public static void main(String[] args) {
		agenda = new Agenda(3);
		scan = new Scanner(System.in);

		int opcao = -1;

		do {
			opcao = lerOpcao();

			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado");
				break;
			case 1:
				inserirContato();
				break;
			case 2:
				buscarContato();
				break;
			default:
				System.out.println("Opção inválida. Digite novamente");
				break;
			}
		} while (opcao != 0);

	}

	public static int lerOpcao() {
		int opcao = -1;
		System.out.println("Aula 52 - Exercício Agenda");
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Adicionar Contato");
		System.out.println("2 - Pesquisar Contato (usando índice)");
		System.out.println("0 - Sair");

		opcao = scan.nextInt();

		return opcao;
	}

	public static void inserirContato() {
		Contato contato = new Contato();
		System.out.println("Informe os dados do contato");

		System.out.println("Nome:");
		scan.nextLine();
		String nome = scan.nextLine();

		System.out.println("Telefone");
		String tel = scan.nextLine();

		System.out.println("E-mail:");
		String email = scan.nextLine();

		contato.setNome(nome);
		contato.setEmail(tel);
		contato.setEmail(email);

		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			e.printStackTrace();
		}
	}

	public static void buscarContato() {
		Contato contato;

		System.out.println("Informe o índice do contato");
		int indice = scan.nextInt();

		try {
			contato = agenda.buscarContato(indice);
			if (contato != null) {
				System.out.println("Contato encontrado");
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Telefone: " + contato.getTelefone());
				System.out.println("E-mail: " + contato.getEmail());
			}
		} catch (ContatoNaoExisteException e) {
			e.printStackTrace();
		}

	}

}
