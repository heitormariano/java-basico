package com.loiane.cursojava.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();

		lampada.ligar();
		System.out.println("Estado da lâmpada:");
		lampada.exibirEstado();

		lampada.desligar();
		System.out.println("Estado da lâmpada:");
		lampada.exibirEstado();

		System.out.println("Usando método de mudança de estado");
		lampada.alterarEstado();
		lampada.exibirEstado();

		lampada.alterarEstado();
		lampada.exibirEstado();
	}
}
