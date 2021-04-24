package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {
	private static String[][] agenda;

	public static void main(String[] args) {
		//mês e dia padrões
		agenda = new String[30][24];
		Scanner scan = new Scanner(System.in);

		boolean continua = false;
		int dia, hora, escolha = 0;

		System.out.println("Agenda True");
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Agendar um compromisso");
			System.out.println("2 - Pesquisar um compromisso existente");
			System.out.println("3 - Terminar o programa");
			escolha = scan.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Informe o dia:");
				dia = scan.nextInt() - 1;
				System.out.println("Informe a hora:");
				hora = scan.nextInt();

				boolean resultado = hasVaga(dia, hora);
				if (resultado) {
					System.out.println("Dia e hora disponíveis. Informe o compromisso");
					scan.nextLine();
					agenda[dia][hora] = scan.nextLine();
				} else {
					System.out.println("Dia e hora com compormisso marcado. Escolha outro dia e hora");
				}
				break;
			case 2:
				System.out.println("Informe o dia:");
				dia = scan.nextInt() - 1;
				System.out.println("Informe a hora:");
				hora = scan.nextInt();
				String retorno = pesquisarCompromisso(dia, hora);
				if (retorno != null) {
					System.out.println(retorno);
				} else {
					System.out.println("Problema na execução da pesquisa. Tente novamente");
				}
				break;
			case 3:
				continua = true;
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção inválida. Digite uma opção válida");
				break;
			}

		} while (!continua);
	}

	public static boolean hasVaga(int dia, int hora) {
		if ((dia >= 0 && dia <= 30) && (hora >= 0 && hora <= 23)) {
			if (agenda[dia][hora] == null) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Dia ou hora inválidos");
		}
		return false;
	}

	public static String pesquisarCompromisso(int dia, int hora) {
		boolean resultado = hasVaga(dia, hora);
		if (resultado) {
			return "Não existe um compromisso agendado para este dia e hora";
		} else {
			return agenda[dia][hora];
		}
	}
}
