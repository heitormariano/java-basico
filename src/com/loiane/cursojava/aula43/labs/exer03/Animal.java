package com.loiane.cursojava.aula43.labs.exer03;

public class Animal {

	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;

	public Animal() {
		this.patas = 4;
	}

	public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Animal: " + this.nome + "\n");
		sb.append("Comprimento: " + this.comprimento + " cm" +"\n");
		sb.append("Patas: " + this.patas + "\n");
		sb.append("Cor: " + this.cor + "\n");
		sb.append("Ambiente: " + this.ambiente+ "\n");
		sb.append("Velocidade: " + this.velocidade + " m/s" + "\n");
		
		return sb.toString();
	}
}
