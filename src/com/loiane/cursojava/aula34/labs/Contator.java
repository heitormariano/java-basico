package com.loiane.cursojava.aula34.labs;

public class Contator {

	private static int count;
	
	public Contator(){
		incrementar();
	}

	public static void zerar() {
		Contator.count = 0;
	}

	public static void incrementar() {
		Contator.count++;
	}

	public static int obterValor() {
		return Contator.count;
	}
}
