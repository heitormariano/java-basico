package com.loiane.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		this.setAmbiente("Terra");
	}

	public Mamifero(String alimento) {
		this.alimento = alimento;
	}

	public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
			String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	String getAlimento() {
		return alimento;
	}

	void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Alimento: " + this.alimento + "\n");

		return sb.toString();
	}

}
