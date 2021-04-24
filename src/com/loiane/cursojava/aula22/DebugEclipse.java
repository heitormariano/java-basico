package com.loiane.cursojava.aula22;

public class DebugEclipse {

	public static void main(String[] args) {
		int[] notas = new int[3];

		//forçando erro
		/*for (int i = 0; i < 4; i++) {
			notas[i] = i;
		}*/
		
		//sem erro
		for (int i = 0; i < notas.length; i++) {
			notas[i] = i;
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
