package com.loiane.cursojava.aula20;

public class MatrizesP2 {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		// as atribuições poderiam continuar até notasAlunos[29][3] = valor;

		System.out.println("Array Orginal:");
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + "  ");
			}
			System.out.println();
		}

		// mudando o valor do elemento da segunda linha e quarta coluna
		notasAlunos[1][3] = 8.7;

		System.out.println();

		// acessando os valores do array multidimensional após a mudança de um
		// dos seus elementos
		System.out.println("Array atualizado:");
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Médias:");
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + i + " = " + soma / notasAlunos[i].length);
		}

		// inicializando vetores de "uma só vez"
		System.out.println();
		System.out.println("Outra forma de inicializar vetores");
		double[] valores1 = { 2.3, 5.4, 6.5, 7.8, 9, 10 };

		double[][] valores2 = { { 2, 4.6, 7, 8.9, 4.7 }, { 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5 } };
		
		System.out.println();
		System.out.println("Valores matriz 1:");
		for(double elem : valores1){
			System.out.println(elem);
		}
		
		System.out.println();
		System.out.println("Valores matriz 2: ");
		for (int i = 0; i < valores2.length; i++) {
			for (int j = 0; j < valores2[i].length; j++) {
				System.out.println(valores2[i][j]);
			}
		}
	}
}
