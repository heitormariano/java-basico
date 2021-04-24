package com.loiane.cursojava.aula43.labs.exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public ContaBancaria() {
		this.saldo = 100.00;
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			throw new IllegalArgumentException("Valor é superior ao saldo disponível");
		}
	}

	public boolean depositar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
			return true;
		} else {
			throw new IllegalArgumentException("Valor inválido para depósito");
		}
	}

	public double obterSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

}
