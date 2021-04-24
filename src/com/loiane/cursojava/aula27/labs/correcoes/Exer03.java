package com.loiane.cursojava.aula27.labs.correcoes;

import java.io.NotActiveException;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println("Informe o nome do aluno:");
		aluno.nome = scan.nextLine();

		System.out.println("Informe a matrícula");
		aluno.matricula = scan.next();

		System.out.println("Informe o nome do Curso");
		aluno.nomeCurso = scan.next();

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "ª disciplina: ");
			aluno.disciplinas[i] = scan.next();
		}

		for (int i = 0; i < aluno.notaDisciplinas.length; i++) {
			System.out.println("Recuperando as notas da disciplina " + aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notaDisciplinas[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota: ");
				aluno.notaDisciplinas[i][j] = scan.nextDouble();
			}
			System.out.println();
		}

		aluno.mostrarInfo();
		boolean resultado = false;
		System.out.println("Resultados");
		for(int i = 0; i < aluno.disciplinas.length; i++){
			resultado = aluno.verificarAprovado(i);
			if(resultado){
				System.out.println(aluno.disciplinas[i] + " - Aprovado");
			}else{
				System.out.println(aluno.disciplinas[i] + " - Reprovado");
			}
		}
	}
}
