package com.loiane.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		double alicota = 0.1; // 10%
		return getRendaBruta() * alicota;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pessoa jurídica[");
		sb.append(super.toString());
		sb.append(", CNPJ: " + this.cnpj);
		sb.append(", imposto a ser pago: " + this.calcularImposto());
		sb.append("]");

		return sb.toString();
	}

}
