package com.loiane.cursojava.aula33.labs;

public class ContaCorrente {

	private double saldo;
	private String proprietario;
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;

	public ContaCorrente() {
	}

	public ContaCorrente(double saldo, String proprietario, String numero, String agencia, boolean especial,
			double limiteEspecial) {
		this.saldo = saldo;
		this.proprietario = proprietario;
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public boolean realizarSaque(double quantiaSaque) {
		if (saldo >= quantiaSaque) {
			saldo -= quantiaSaque;
			return true;
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaSaque) {
					saldo -= quantiaSaque;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}

	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
