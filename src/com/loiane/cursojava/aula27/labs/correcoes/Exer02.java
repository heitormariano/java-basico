package com.loiane.cursojava.aula27.labs.correcoes;

public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.proprietario = "Felipe da Silva";
		conta.numero = "1234-5";
		conta.agencia = "56567-8";
		conta.especial = true;
		conta.limiteEspecial = 500.00;
		conta.saldo = -10;

		System.out.println("Saldo da conta: " + conta.numero + " = " + conta.saldo);

		boolean saqueEfetuado = conta.realizarSaque(10);
		System.out.println("Tentativa de saque de 10 reais");

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}

		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}

		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

		saqueEfetuado = conta.realizarSaque(60);
		System.out.println("Tentativa de saque de 60 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}
}
