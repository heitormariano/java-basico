package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;

	String[] disciplinas = new String[3]; // arrays para as tr�s disciplinas
	String[][] situacoes = new String[3][1]; // uma situa��o (aprovado ou reprovado) para cada disciplina
	double[][] notaDisciplinas = new double[3][4]; // quatro notas para cada disciplina

	void imprimirMenu() {
		Scanner scan = new Scanner(System.in);
		obterDadosAlunoEDisciplinas(scan);
		ImprimirDadosAluno();
		obterResultadoDisciplinas(scan);
	}

	void ImprimirDadosAluno() {
		System.out.println("Nome: " + nome);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome do Curso: " + nomeCurso);
	}

	void obterDadosAlunoEDisciplinas(Scanner scan) {
		System.out.println("Informe o nome do aluno:");
		nome = scan.nextLine();

		System.out.println("Informe a matr�cula");
		matricula = scan.next();

		System.out.println("Informe o nome do Curso");
		nomeCurso = scan.next();

		System.out.println("Disciplinas");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "� disciplina: ");
			disciplinas[i] = scan.next();
		}

		System.out.println("Notas Disciplinas");
		for (int i = 0; i < notaDisciplinas.length; i++) {
			System.out.println("Disciplina de " + disciplinas[i]);
			for (int j = 0; j < notaDisciplinas[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "� nota: ");
				notaDisciplinas[i][j] = scan.nextDouble();
			}
			System.out.println();
		}
	}

	// M�todo para obter os resultados por disciplina
	void obterResultadoDisciplinas(Scanner scan) {
		int opcao = -1;
		boolean sair = false;

		do {
			System.out.println("Informe a disciplina (n�mero) para obter o resultado: ");
			for (int i = 0; i < disciplinas.length; i++) {
				System.out.println((i + 1) + " - " + disciplinas[i]);
			}
			System.out.println("0 - Finalizar");
			opcao = scan.nextInt();

			if (opcao > 0 && opcao <= 3) {
				// a vari�vel "opcao" servir� de �ndice para o m�todo obterMedia
				// o �ndice precisa estar entre 0 e 2 (posi��es v�lidas do array)
				opcao--;
				System.out.println("Disciplina: " + disciplinas[opcao]);
				double media = obterMedia(opcao);
				System.out.println("M�dia obtida: " + media);
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

	// M�todo para definir a situa��o por disciplina
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
