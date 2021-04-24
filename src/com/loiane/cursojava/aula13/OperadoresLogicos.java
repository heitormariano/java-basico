package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int valor01 = 2;
		int valor02 = 4;
		
		boolean resultado01 = (valor01 == 2) && (valor02 == 4);
		System.out.println("valor02 é 2 AND valor02 é 4 - resultado: " + resultado01);
		
		boolean resultado02 = (valor01 == 2) || (valor02 ==  4);
		System.out.println("valor01 é 2 OR valor02 é 4 - resultado: " + resultado02);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("Novos testes de resultados:");
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		System.out.println(verdadeiro || !falso);
	}
}
