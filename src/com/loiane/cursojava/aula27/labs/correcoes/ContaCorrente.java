package com.loiane.cursojava.aula27.labs.correcoes;

public class ContaCorrente {
	/* Sugestão: refazer o algoritmo, impedindo o uso de saldos negativos. */

	double saldo; // o saldo poderá ser negativo
	String proprietario;
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;

	boolean realizarSaque(double quantiaSaque) {
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

	void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}

	void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}

	// O sado negativo indica o uso do cheque especial
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
