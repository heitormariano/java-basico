package com.loiane.cursojava.aula20;

import java.util.Arrays;

public class MatrizesP1 {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[30][4];

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
		System.out.println("Tamanho do Array: " + notasAlunos.length);
		//System.out.println("Array 1 da matriz multidimensional: " + Arrays.toString(notasAlunos[0]));
		
		for(int i = 0; i < notasAlunos.length; i++){
			System.out.println("Array " + (i + 1) + " da matriz multidimensional: " + Arrays.toString(notasAlunos[i]));
		}
	}
}
