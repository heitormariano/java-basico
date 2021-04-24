package com.loiane.cursojava.aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int gantiaMeses;
	String[] tipos;
	double preco;
	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void exibirEstado() {
		if (ligada) {
			System.out.println("A l�mpada est� ligada");
		} else {
			System.out.println("A l�mpada est� desligada");
		}
	}

	void alterarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
