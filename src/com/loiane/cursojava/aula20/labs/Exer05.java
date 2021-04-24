package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {
	private static String[][][] agenda;
	private static int mes, dia, hora;
	private static Scanner scan;

	public static void main(String[] args) {
		agenda = new String[12][][];
		scan = new Scanner(System.in);

		boolean continua = true;
		int escolha = -1;

		criarAgenda();

		System.out.println("Agenda True");
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Agendar um compromisso");
			System.out.println("2 - Pesquisar um compromisso existente");
			System.out.println("3 - Listas todos os compromissos");
			System.out.println("4 - Terminar o programa");
			escolha = scan.nextInt();

			switch (escolha) {
			case 1:
				recuperarDados();
				boolean validadeDados = verificarMesDiaHora();

				if (validadeDados) {
					informarCompromisso();
				} else {
					System.out.println("Mes, dia ou horário inválido.");
				}
				break;
			case 2:
				recuperarDados();
				String retorno = pesquisarCompromisso();
				if (retorno != null) {
					System.out.println(retorno);
				} else {
					System.out.println("Problema na execução da pesquisa. Tente novamente");
				}
				break;
			case 3:
				listarTodosCompromissos();
				break;
			case 4:
				continua = false;
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção inválida. Digite uma opção válida");
				break;
			}

		} while (continua);
	}

	public static boolean hasVaga(int mes, int dia, int hora) {
		if (agenda[mes][dia][hora] == null) {
			return true;
		} else {
			return false;
		}
	}

	public static String pesquisarCompromisso() {
		boolean resultado = hasVaga(mes, dia, hora);
		if (resultado) {
			return "NÃO existe um compromisso agendado para o mês, dia e horário informado.";
		} else {

			return "Já existe um compromisso agendado: " + agenda[mes][dia][hora];
		}
	}

	public static boolean verificarMesDiaHora() {
		if (((mes + 1) >= 1 && (mes + 1) <= 12) && (hora >= 0 && hora <= 23)) {
			if ((mes + 1) == 1 || (mes + 1) == 3 || (mes + 1) == 5 || (mes + 1) == 7 || (mes + 1) == 8
					|| (mes + 1) == 10 || (mes + 1) == 12) {
				if ((dia + 1) >= 1 && (dia + 1) <= 31) {
					return true;
				}
			} else if ((mes + 1) == 4 || (mes + 1) == 6 || (mes + 1) == 9 || (mes + 1) == 11) {
				if ((dia + 1) >= 1 && (dia + 1) <= 30) {
					return true;
				}
			} else if ((mes + 1) == 2) {
				if ((dia + 1) >= 1 && (dia + 1) <= 28) {
					return true;
				}
			}
		}
		return false;
	}

	public static void recuperarDados() {
		System.out.println("Informe o mês:");
		mes = scan.nextInt() - 1;

		System.out.println("Informe o dia");
		dia = scan.nextInt() - 1;

		System.out.println("Informe a hora");
		hora = scan.nextInt();
	}

	public static void informarCompromisso() {
		boolean resultado = hasVaga(mes, dia, hora);
		if (resultado) {
			System.out.println("Mês, dia e horário disponíveis. Informe o compromisso");
			scan.nextLine();
			agenda[mes][dia][hora] = scan.nextLine();
		} else {
			System.out.println("Já existe um compromisso para o mês, dia e horário escolhidos.");
		}
	}

	public static void criarAgenda() {
		agenda = new String[12][][];
		for (int i = 0; i < 12; i++) {
			if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 5 || (i + 1) == 7 || (i + 1) == 8 || (i + 1) == 10
					|| (i + 1) == 12) {
				agenda[i] = new String[31][24];
			} else if ((i + 1) == 4 || (i + 1) == 6 || (i + 1) == 9 || (i + 1) == 11) {
				agenda[i] = new String[30][24];
			} else if ((i + 1) == 2) {
				agenda[i] = new String[28][24];
			}
		}
	}

	public static void listarTodosCompromissos() {
		int cont = 0;
		for (int i = 0; i < agenda.length; i++) {
			for (int j = 0; j < agenda[i].length; j++) {
				for (int k = 0; k < agenda[i][j].length; k++) {
					if (agenda[i][j][k] != null) {
						cont++;
						System.out.println("Mes " + (i + 1) + " - Dia " + (j + 1) + " - Hora " + k);
						System.out.println("Compromisso : " + agenda[i][j][k]);
					}
				}
			}
		}
		System.out.println();
		if (cont == 0) {
			System.out.println("Nenhum compromisso agendado");
		}
	}
}
