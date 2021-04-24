package com.loiane.cursojava.aula52;

public class DivisaoNaoExataException extends Exception {

	private int num; // numerador
	private int dem; // denominador

	public DivisaoNaoExataException(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + " / " + dem + " não é inteiro";
	}
}
