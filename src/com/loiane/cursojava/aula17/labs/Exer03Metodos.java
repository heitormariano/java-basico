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
				System.out.println("Nome v�lido");
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
				System.out.println("Idade v�lida");
			}
		} while (!infoValido);
	}

	private static void verificarSalario() {

		boolean infoValido = false;

		do {
			System.out.println("Informe o sal�rio:");
			double salario = scan.nextDouble();
			if (salario == 0) {
				System.out.println("Sal�rio igual a zero. Digite novamente");
			} else {
				infoValido = true;
				System.out.println("Sal�rio V�lido");
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
				System.out.println("Tipo de sexo V�lido");
				break;
			default:
				System.out.println("Tipo de sexo Inv�lido. Digite novamente");
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
			System.out.println("v - Vi�vo");
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
				System.out.println("Estado civil V�lido");
				break;
			default:
				System.out.println("Estado civil inv�lido. Digite novamente");
				break;
			}
		} while (!infoValido);
	}
}
