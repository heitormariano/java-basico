package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome;
		int idade;
		double salario;
		char sexo, estadoCivil;

		boolean infoValidas = false;

		do {
			System.out.println("Informe o nome:");
			nome = scan.next();
			if (nome.length() >= 3) {
				infoValidas = true;
				System.out.println("Nome valido.");
			} else {
				System.out.println("Nome muito curto (menos de 3 caracteres). Digite novamente");
			}
		} while (!infoValidas);

		infoValidas = false;

		do {
			System.out.println("Informe a idade:");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValidas = true;
				System.out.println("Idade valida.");
			} else {
				System.out.println("Idade tem que estar entre 0 e 150. Digite novamente");
			}
		} while (!infoValidas);

		infoValidas = false;

		do {
			System.out.println("Digite o salario: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValidas = true;
				System.out.println("Salario Valido.");
			} else {
				System.out.println("O salario precisa ser maior que zero. Digite Novamente");
			}
		} while (!infoValidas);

		infoValidas = false;

		do {
			System.out.println("Digite o sexo: ");
			System.out.println(" m -> Masculino ");
			System.out.println(" f -> Feminino ");
			sexo = scan.next().charAt(0);

			if (sexo == 'm' || sexo == 'f') {
				infoValidas = true;
				System.out.println("Sexo valido.");
			} else {
				System.out.println("O sexo deve ser Masculino(m) ou Feminino(f). Digite Novamente");
			}
		} while (!infoValidas);

		infoValidas = false;

		do {
			System.out.println("Digite o estado civil: ");
			System.out.println(" s -> Solteiro(a) ");
			System.out.println(" c -> Casado(a) ");
			System.out.println(" v -> Viuvo(a) ");
			System.out.println(" d -> Divorciado(a) ");

			estadoCivil = scan.next().charAt(0);

			if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
				infoValidas = true;
				System.out.println("Estado civil valido.");
			} else {
				System.out.println(
						"Os estados civis permitidos sao: solteiro(s), casado(c), viuvo(v) ou divorciado(d). Digite Novamente");
			}
		} while (!infoValidas);

		System.out.println();

		System.out.println("Informacoes fornecidas");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

		System.out.println("Fim da execucao!");
	}
}
