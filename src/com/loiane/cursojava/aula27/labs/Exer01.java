package com.loiane.cursojava.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();

		lampada.ligar();
		System.out.println("Estado da l�mpada:");
		lampada.exibirEstado();

		lampada.desligar();
		System.out.println("Estado da l�mpada:");
		lampada.exibirEstado();

		System.out.println("Usando m�todo de mudan�a de estado");
		lampada.alterarEstado();
		lampada.exibirEstado();

		lampada.alterarEstado();
		lampada.exibirEstado();
	}
}
