package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) throws Exception {
		Agenda agenda = new Agenda();
		Scanner scan = new Scanner(System.in);
		int opcao = -1;

		System.out.println("Exercício 01");

		do {
			System.out.println("Escolha uma das opções:");
			System.out.println("1 - Informar nome da Agenda");
			System.out.println("2 - Informar Contato");
			System.out.println("3 - Imprimir Nome da Agenda");
			System.out.println("4 - Imprimir quantidade de contatos");
			System.out.println("5 - Imprimir Contato específico (usar índice)");
			System.out.println("6 - Imprimir todos os contatos");
			System.out.println("0 - Sair");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Fim do programa.");
				break;
			case 1:
				System.out.println("Difite um nome para agenda:");
				scan.nextLine();
				String nome = scan.nextLine();
				agenda.setNome(nome);
				break;
			case 2:
				System.out.println("Informe os seguintes dados para o contato:");

				System.out.println("Nome:");
				scan.nextLine();
				String nomeCont = scan.nextLine();

				System.out.println("Telefone:");
				String telCont = scan.nextLine();

				System.out.println("Email:");
				String emailCont = scan.nextLine();

				Contato contato = new Contato();
				contato.setNome(nomeCont);
				contato.setTelefone(telCont);
				contato.setEmail(emailCont);

				agenda.adicionarContato(contato);
				break;
			case 3:
				if (agenda.getNome() == null || agenda.getNome().isEmpty()) {
					System.out.println("Nome da Agenda não foi informado");
				} else {
					System.out.println("Nome: " + agenda.getNome());
				}
				break;
			case 4:
				System.out.println("[Imprimir] Quantidade de contatos:");
				System.out.println(agenda.obterTamanho());
				break;
			case 5:
				if (hasContatos(agenda)) {
					System.out.println("[Imprimir] Informe o índice do contato:");
					int indice = scan.nextInt();
					System.out.println(agenda.imprimirContato(indice));
				} else {
					System.out.println("Nenhum contato foi informado. Por favor, insira um contato");
				}
				break;
			case 6:
				if (hasContatos(agenda)) {
					System.out.println("[Imprimir] Todos os contatos da Agenda:");
					System.out.println(agenda.imprimirTodosContatos());
				} else {
					System.out.println("Agenda está vazia. Por favor, insira contatos para impressão");
				}
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
				break;
			}
		} while (opcao != 0);

	}

	private static boolean hasContatos(Agenda agenda) {
		if (agenda.obterTamanho() != 0) {
			return true;
		} else {
			return false;
		}
	}
}
