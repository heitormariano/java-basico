package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		// percorrendo elementos com um "for"
		System.out.print("Notas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println();
		System.out.print("Usando for each. Notas: ");
		for (int nota : notas) {
			System.out.print(nota + " ");
		}
		
		//Exemplo 2 - percoorendo matriz (array multidimensional) com for each
		System.out.println("\nExemplo com array multidimensional.");
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 10;
		notasAlunos[1][2] = 7.7;
		notasAlunos[1][3] = 5.6;

		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 6;
		notasAlunos[2][2] = 8.8;
		notasAlunos[2][3] = 9.2;
		
		System.out.println("Notas de alunos");
		for(double[] notasAluno : notasAlunos){
			for(double nota : notasAluno){
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}
}
