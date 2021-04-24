package com.loiane.cursojava.aula43.labs.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public ContaPoupanca() {

	}

	public ContaPoupanca(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	// será informado um porcentual (Ex: 10%, 20%, etc)
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();

		if (this.diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			double saldo = super.obterSaldo();

			if (taxaRendimento >= 0) {
				saldo += (saldo * (taxaRendimento / 100));
				super.setSaldo(saldo);
				return true;
			} else {
				throw new IllegalArgumentException("Taxa de rendimento negativa");
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ContaPoupanca [");
		sb.append("Nome Titular: " + this.getNomeCliente() + ", ");
		sb.append("Número: " + this.getNumConta() + ", ");
		sb.append("Saldo: " + this.getSaldo() + ", ");
		sb.append("Dia rendimento: " + this.diaRendimento);
		sb.append("]");

		return sb.toString();
	}
	
	/*@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ContaPoupanca [");
		sb.append("Dia rendimento: " + this.diaRendimento);
		sb.append(", ");
		sb.append(super.toString()); //usando o toString() da super classe (ContaBancaria)
		sb.append("]");

		return sb.toString();
	}*/
}
