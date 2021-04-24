package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03Metodos {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		verificarNome();
		verificarIdade();
		verificarSalario();
		verificarSexo();
		verificarEstadoCivil();
	}

	private static void verificarNome() {

		boolean infoValido = false;

		do {
			System.out.println("Informe o seu nome:");
			String nome = scan.nextLine();
			if (nome.length() < 3) {
				System.out.println("Nome com menos de 3 caracteres. Digite novamente");
			} else {
				infoValido = true;
				System.out.println("Nome válido");
			}
		} while (!infoValido);

	}

	private static void verificarIdade() {
		boolean infoValido = false;

		do {
			System.out.println("Informe a sua idade:");
			int idade = scan.nextInt();
			if (idade > 150) {
				System.out.println("Idade acima de 150 anos. Digite novamente");
			} else {
				infoValido = true;
				System.out.println("Idade válida");
			}
		} while (!infoValido);
	}

	private static void verificarSalario() {

		boolean infoValido = false;

		do {
			System.out.println("Informe o salário:");
			double salario = scan.nextDouble();
			if (salario == 0) {
				System.out.println("Salário igual a zero. Digite novamente");
			} else {
				infoValido = true;
				System.out.println("Salário Válido");
			}
		} while (!infoValido);

	}

	private static void verificarSexo() {
		boolean infoValido = false;

		do {
			System.out.println("Informe o Sexo:");
			System.out.println("m - Masculino");
			System.out.println("f - Feminino");

			char sexo = scan.next().charAt(0);
			switch (sexo) {
			case 'm':
			case 'M':
			case 'f':
			case 'F':
				infoValido = true;
				System.out.println("Tipo de sexo Válido");
				break;
			default:
				System.out.println("Tipo de sexo Inválido. Digite novamente");
				break;
			}
		} while (!infoValido);
	}

	private static void verificarEstadoCivil() {
		boolean infoValido = false;

		do {
			System.out.println("Informe um estado civil:");
			System.out.println("s - Solteiro");
			System.out.println("c - Casado");
			System.out.println("v - Viúvo");
			System.out.println("d - Divorciado");

			char estadoCivil = scan.next().charAt(0);
			switch (estadoCivil) {
			case 's':
			case 'S':

			case 'c':
			case 'C':

			case 'v':
			case 'V':

			case 'd':
			case 'D':
				infoValido = true;
				System.out.println("Estado civil Válido");
				break;
			default:
				System.out.println("Estado civil inválido. Digite novamente");
				break;
			}
		} while (!infoValido);
	}
}
