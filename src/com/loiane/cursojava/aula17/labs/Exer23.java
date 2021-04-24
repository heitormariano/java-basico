package com.loiane.cursojava.aula17.labs;

public class Exer23 {
	private static final double PRECO_ITEM = 1.99;
	public static void main(String[] args) {
		System.out.println("Lojas Quase Dois - Tabela de preços (até 50 itens)");
		 
		 for(int i = 0; i < 50; i++){
			 System.out.println((i+1) + " - R$ "  + PRECO_ITEM * (i+1));
		 }
	}
}
