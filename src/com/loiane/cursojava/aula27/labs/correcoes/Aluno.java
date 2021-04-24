package com.loiane.cursojava.aula27.labs.correcoes;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] disciplinas = new String[3];
	double[][] notaDisciplinas = new double[3][4];

	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do Curso: " + nomeCurso);

		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print("Notas da disciplina " + disciplinas[i] + " : ");
			for (int j = 0; j < notaDisciplinas[i].length; j++) {
				System.out.print(notaDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}

	boolean verificarAprovado(int indice) {
		double media = 0;
		media = obterMedia(indice);

		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	double obterMedia(int indice) {
		double soma = 0;
		double media = 0;
		for (int i = 0; i < notaDisciplinas[indice].length; i++) {
			soma += notaDisciplinas[indice][i];
		}

		media = soma / notaDisciplinas[indice].length;
		return media;
	}
}
