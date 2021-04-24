package com.loiane.cursojava.aula20.labs.correcoes;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//os compromissos serão até as 8h do dia 
		//[os arrays de horas terão 9 posições, 0 até 8]
		String[][][] compromissos = new String[12][31][9];

		boolean sair = false;
		byte opcao = -1;

		while (!sair) {
			System.out.println("Agenda de Compromissos");
			System.out.println("Opções:");
			System.out.println("1 - Adicionar compromisso");
			System.out.println("2 - Pesquisar compromisso");
			System.out.println("0 - Sair do programa");

			opcao = scan.nextByte();

			if (opcao == 1) {
				
				boolean mesValido = false;
				int mes = 0;
				
				while (!mesValido) {
					System.out.println("Informe o mês");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido. Digite novamente");
					}
				}
				
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Informe o dia do mês");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Digite novamente.");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) {
					System.out.println("informe a hora do compromisso");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida. Digite novamente.");
					}

				}
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso");
				compromissos[mes][dia][hora] = scan.next();

			} else if (opcao == 2) {
				
				boolean mesValido = false;
				int mes = 0;

				while (!mesValido) {
					System.out.println("Informe o mês");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido. Digite novamente");
					}
				}
				
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Informe o dia do mês");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Digite novamente.");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) {
					System.out.println("informe a hora do compromisso");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 23) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida. Digite novamente.");
					}

				}

				mes--;
				dia--;
				System.out.println("O compromisso agendado:");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;
				System.out.println("Fim do Programa.");
			} else {
				System.out.println("Opção inválida. Digite novamente.");
			}
		}
	}
}
