package com.loiane.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso = false;
		
		// AND simples. A segunda expressão (verdadeiro) é analisada
		boolean resultado01 = falso & verdadeiro; 
		//AND curto circuito. No exemplo abaixo já se sabe que o resultado será falso.
		//Não é necessário ver a segunda expressão (verdadeiro)
		boolean resultado02 = falso && verdadeiro;
		
		System.out.println(resultado01);
		System.out.println(resultado02);
	}
}
