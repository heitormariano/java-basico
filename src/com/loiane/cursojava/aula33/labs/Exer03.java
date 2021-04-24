package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

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
			aluno.getDisciplinas()[i] = scan.next();
		}

		for (int i = 0; i < aluno.getNotaDisciplinas().length; i++) {
			System.out.println("Recuperando as notas da disciplina " + aluno.getDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotaDisciplinas()[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota: ");
				aluno.getNotaDisciplinas()[i][j] = scan.nextDouble();
			}
			System.out.println();
		}

		aluno.mostrarInfo();
		boolean resultado = false;
		System.out.println("Resultados");
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			resultado = aluno.verificarAprovado(i);
			if (resultado) {
				System.out.println(aluno.getDisciplinas()[i] + " - Aprovado");
			} else {
				System.out.println(aluno.getDisciplinas()[i] + " - Reprovado");
			}
		}
	}
}
