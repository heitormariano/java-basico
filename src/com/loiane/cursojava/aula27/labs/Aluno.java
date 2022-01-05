package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;

	String[] disciplinas = new String[3]; // arrays para as três disciplinas
	String[][] situacoes = new String[3][1]; // uma situação (aprovado ou reprovado) para cada disciplina
	double[][] notaDisciplinas = new double[3][4]; // quatro notas para cada disciplina

	void imprimirMenu() {
		Scanner scan = new Scanner(System.in);
		obterDadosAlunoEDisciplinas(scan);
		ImprimirDadosAluno();
		obterResultadoDisciplinas(scan);
	}

	void ImprimirDadosAluno() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do Curso: " + nomeCurso);
	}

	void obterDadosAlunoEDisciplinas(Scanner scan) {
		System.out.println("Informe o nome do aluno:");
		nome = scan.nextLine();

		System.out.println("Informe a matrícula");
		matricula = scan.next();

		System.out.println("Informe o nome do Curso");
		nomeCurso = scan.next();

		System.out.println("Disciplinas");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "ª disciplina: ");
			disciplinas[i] = scan.next();
		}

		System.out.println("Notas Disciplinas");
		for (int i = 0; i < notaDisciplinas.length; i++) {
			System.out.println("Disciplina de " + disciplinas[i]);
			for (int j = 0; j < notaDisciplinas[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota: ");
				notaDisciplinas[i][j] = scan.nextDouble();
			}
			System.out.println();
		}
	}

	// Método para obter os resultados por disciplina
	void obterResultadoDisciplinas(Scanner scan) {
		int opcao = -1;
		boolean sair = false;

		do {
			System.out.println("Informe a disciplina (número) para obter o resultado: ");
			for (int i = 0; i < disciplinas.length; i++) {
				System.out.println((i + 1) + " - " + disciplinas[i]);
			}
			System.out.println("0 - Finalizar");
			opcao = scan.nextInt();

			if (opcao > 0 && opcao <= 3) {
				// a variável "opcao" servirá de índice para o método obterMedia
				// o índice precisa estar entre 0 e 2 (posições válidas do array)
				opcao--;
				System.out.println("Disciplina: " + disciplinas[opcao]);
				double media = obterMedia(opcao);
				System.out.println("Média obtida: " + media);
				System.out.println("Resultado: " + obterSituacao(opcao, media));

			} else if (opcao == 0) {
				System.out.println("Fim da busca de resultados");
				sair = true;
			}

		} while (!sair);
	}

	double obterMedia(int indexDisciplina) {
		double soma = 0;
		double media = 0;
		for (int i = 0; i < notaDisciplinas[indexDisciplina].length; i++) {
			soma += notaDisciplinas[indexDisciplina][i];
		}
		media = soma / notaDisciplinas[indexDisciplina].length;
		return media;
	}

	// Método para definir a situação por disciplina
	String obterSituacao(int indexDisciplina, double media) {
		if (media >= 7.0) {
			situacoes[indexDisciplina][0] = "Aprovado";
			return situacoes[indexDisciplina][0];
		} else {
			situacoes[indexDisciplina][0] = "Reprovado";
			return situacoes[indexDisciplina][0];
		}
	}
}
