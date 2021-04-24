package com.loiane.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso = false;
		
		// AND simples. A segunda express�o (verdadeiro) � analisada
		boolean resultado01 = falso & verdadeiro; 
		//AND curto circuito. No exemplo abaixo j� se sabe que o resultado ser� falso.
		//N�o � necess�rio ver a segunda express�o (verdadeiro)
		boolean resultado02 = falso && verdadeiro;
		
		System.out.println(resultado01);
		System.out.println(resultado02);
	}
}
