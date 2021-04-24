package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03V2 {

	public static void main(String[] args) {
		// nesta classe serão usados métodos auxiliares criados na classe Aluno

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println("Informe o nome do aluno:");
		aluno.setNome(scan.nextLine());

		System.out.println("Informe a matrícula");
		aluno.setMatricula(scan.next());

		System.out.println("Informe o nome do Curso");
		aluno.setNomeCurso(scan.next());

		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "ª disciplina: ");
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		System.out.println();

		for (int i = 0; i < aluno.getNotaDisciplinas().length; i++) {
			System.out.println("Recuperando as notas da disciplina " + aluno.getDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotaDisciplinas()[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota: ");
				aluno.setNotaDisciplinaPos(i, j, scan.nextDouble());
			}
			System.out.println();
		}

		aluno.mostrarInfo();
		boolean resultado = false;
		System.out.println("Resultados");
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			resultado = aluno.verificarAprovado(i);
			if (resultado) {
				System.out.println(aluno.getDisciplinas()[i] + " - " + "Média: " + aluno.obterMedia(i) + " (Aprovado)");
			} else {
				System.out.println(aluno.getDisciplinas()[i] + " - " + "Média: " + aluno.obterMedia(i) + " (Reprovado)");
			}
		}
	}
}
