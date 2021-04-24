package com.loiane.cursojava.aula20.labs.correcoes;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// padroniza��o: meses de 31 dias e dias com 24 horas
		String[][] compromissos = new String[31][24];

		boolean sair = false;
		byte opcao = -1;

		while (!sair) {
			System.out.println("Agenda de Compromissos");
			System.out.println("Op��es:");
			System.out.println("1 - Adicionar compromisso");
			System.out.println("2 - Pesquisar compromisso");
			System.out.println("0 - Sair do programa");

			opcao = scan.nextByte();

			if (opcao == 1) {
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Informe o dia do m�s");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido. Digite novamente.");
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
						System.out.println("Hora inv�lida. Digite novamente.");
					}

				}

				dia--;
				System.out.println("Digite o compromisso");
				//scan.next() - poder� ser informado compromissos de uma palavra
				compromissos[dia][hora] = scan.next(); 

			} else if (opcao == 2) {
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Informe o dia do m�s");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido. Digite novamente.");
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
						System.out.println("Hora inv�lida. Digite novamente.");
					}

				}

				dia--;
				System.out.println("O compromisso agendado:");
				System.out.println(compromissos[dia][hora]);

			} else if (opcao == 0) {
				sair = true;
				System.out.println("Fim do Programa.");
			} else {
				System.out.println("Op��o inv�lida. Digite novamente.");
			}
		}
	}
}
