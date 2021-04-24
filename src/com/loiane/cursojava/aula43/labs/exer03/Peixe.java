package com.loiane.cursojava.aula43.labs.exer03;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe() {
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.setCaracteristica("Barbatanas e cauda");
	}

	public Peixe(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
			String caracteristica) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;

	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Caracteristica(s): " + this.caracteristica + "\n");

		return sb.toString();
	}
}
