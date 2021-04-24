package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int qtdTurmas;
		int qtdAlunos;
		int soma = 0;
		double mediaAlunos;

		System.out.println("Informe a quantidade de turmas:");
		qtdTurmas = scan.nextInt();

		boolean valido = false;
		for (int i = 0; i < qtdTurmas; i++) {
			valido = false;
			do {
				System.out.println("Informe a quantidade de alunos na turma " + (i + 1) + " :");
				qtdAlunos = scan.nextInt();
				if (qtdAlunos <= 40) {
					valido = true;
					soma += qtdAlunos;
				} else {
					System.out.println("A quantidade de alunos precisa ser menor ou igual a 40. Digite Novamente.");
				}

			} while (!valido);
		}

		mediaAlunos = soma / qtdTurmas;
		System.out.println("O número médio de alunos por turma é: " + mediaAlunos);
	}
}
