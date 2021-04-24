package com.loiane.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial() {
		this.limite = 100.00;
	}

	public ContaEspecial(double limite) {
		this.limite = limite;
	}

	double getLimite() {
		return limite;
	}

	protected void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		//depois pensar em uma forma melhor de controlar o saldo e o limite da conta
		double saldo = super.obterSaldo();
		if (valor > saldo) {
			double valorRest = valor - saldo;
			// super.setSaldo(0);
			super.sacar(saldo);
			if (valorRest <= limite) {
				this.limite -= valorRest;
				return true;
			} else {
				throw new IllegalArgumentException("O valor excede a quantia disponível (saldo + limite)");
			}
		} else {
			// saldo -= valor;
			// super.setSaldo(saldo);
			super.sacar(valor);
			return true;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ContaEspecial [");
		sb.append("Nome Titular: " + this.getNomeCliente() + ", ");
		sb.append("Número: " + this.getNumConta() + ", ");
		sb.append("Saldo: " + this.getSaldo() + ", ");
		sb.append("Limite: " + this.limite);
		sb.append("]");

		return sb.toString();
	}

}
