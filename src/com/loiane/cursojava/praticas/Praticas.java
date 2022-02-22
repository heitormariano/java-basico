package com.loiane.cursojava.praticas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Praticas {

	public static void main(String[] args) {

		// exemploBreak();
		// exemploReturn();
		// exArrays();
		// exMatrizes();
		exMetodosArrays();
		// exMatrizRandom();
	}

	public static void exemploBreak() {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
	}

	public static void exemploContinue() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void exemploReturn() {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				return;
			}
			System.out.println(i);
		}
	}

	public static void exArrays() {
		double temps[] = new double[10];
		temps[0] = 10.3;
		temps[1] = 12.45;

		for (int i = 0; i < temps.length; i++) {
			System.out.println("Temperatura " + (i + 1) + " : " + temps[i]);
		}

		String[] nomes = new String[] { "Pedro", "Tiago", "João" };
		System.out.println("Tamanho array:" + nomes.length);

		for (String elem : nomes) {
			System.out.println(elem);
		}
	}

	public static void exMatrizes() {
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 5.5;
		notasAlunos[0][2] = 6.6;
		notasAlunos[0][3] = 7.7;

		notasAlunos[1][0] = 9.5;
		notasAlunos[1][1] = 8.8;
		notasAlunos[1][2] = 7.5;
		notasAlunos[1][3] = 6.9;

		notasAlunos[2][0] = 4.5;
		notasAlunos[2][1] = 5.6;
		notasAlunos[2][2] = 6.4;
		notasAlunos[2][3] = 8.7;

		System.out.println("Tamanho Matriz:" + notasAlunos.length);
		System.out.println("Tamanho do primeiro elemento [array] da matriz:" + notasAlunos[0].length);
		System.out.println(
				"Primeiro Array[primeiro elemento] da matriz multidimensional: " + Arrays.toString(notasAlunos[0]));
		System.out.println("Primeira nota do aluno 1: " + notasAlunos[0][0]);

		// percorrendo elementos da Matriz
		int i, j;
		for (i = 0; i < notasAlunos.length; i++) {
			System.out.println("Notas do aluno " + (i + 1) + ": ");
			System.out.print("[");
			for (j = 0; j < notasAlunos[i].length - 1; j++) {
				System.out.print(notasAlunos[i][j] + ", ");
			}
			// inclusao de ultima nota (sem virgula no final)
			System.out.print(notasAlunos[i][j]);
			System.out.print("]");

			System.out.println();
		}

		// calcular a média de cada aluno
		double soma;
		for (i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + (i + 1) + ": " + (soma / notasAlunos[i].length));
		}

		// inicialização direta de arrays
		double[] valores1 = { 2.3, 4.4, 5.6, 7.8 };
		double[][] valores2 = { { 2, 5.5, 6.7, 8.9 }, { 4, 5, 6, 7 }, { 7.8, 4.8, 6.6, 9.8 } };

		// percorrendo elementos do array valores1
		for (double elem : valores1) {
			System.out.println(elem);
		}

		System.out.println();
		for (double[] elem : valores2) {
			for (double valor : elem) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	}

	public static void exMetodosArrays() {
		List<String> palavras = Arrays.asList("Eu", "Vou", "Passar", "No", "CEFET");
		for (int i = 0; i < palavras.size(); i++) {
			System.out.println("Elemento " + (i + 1) + ": " + palavras.get(i));
		}

		String[] array = new String[] { "Mateus", "Lucas", "João" };
		List<String> nomes = Arrays.asList(array);

		for (String elem : nomes) {
			System.out.println("Nome: " + elem);
		}
	}

	public static void exMatrizRandom() {
		double[][] matriz = new double[2][4];

		Random random = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new BigDecimal(random.nextDouble() * 10).setScale(2, RoundingMode.HALF_DOWN)
						.doubleValue();
			}
		}

		System.out.println("Elementos da Matriz");
		for (double[] elem : matriz) {
			System.out.println(Arrays.toString(elem));
		}
	}
}
