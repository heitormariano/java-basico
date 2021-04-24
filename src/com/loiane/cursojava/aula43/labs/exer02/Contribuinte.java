package com.loiane.cursojava.aula43.labs.exer02;

public abstract class Contribuinte {

	private String nome;
	private double rendaBruta;

	public Contribuinte() {

	}

	public Contribuinte(String nome, double rendaBruta) {
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	double getRendaBruta() {
		return rendaBruta;
	}

	void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	//método abstrato
	public abstract double calcularImposto();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contribuinte other = (Contribuinte) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(rendaBruta) != Double.doubleToLongBits(other.rendaBruta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "nome:" + nome + ", rendaBruta:" + rendaBruta;
	}

}
