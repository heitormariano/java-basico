package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado + 2;
		System.out.println(resultado);
		
		System.out.println(resultado++);
		//mesma coisa que
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);
		//mesma coisa que
		//resultado += 1;
		//System.out.println(resultado);
		
		int resultado2 = 2 + 2;
		System.out.println(resultado2--);
		//mesma coisa que
		//System.out.println(resultado2);
		//resultado2 = resultado2 - 1;
		//resultado2 -= 1;
		
		System.out.println(--resultado2);
		//mesma coisa que
		//resultado2 -= 1;
		//System.out.println(resultado2);
		
	}
}
