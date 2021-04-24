package com.loiane.cursojava.aula33.labs;

public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.setProprietario("Felipe da Silva");
		conta.setNumero("1234-5");
		conta.setAgencia("56567-8");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500.00);
		conta.setSaldo(10);

		System.out.println("Saldo da conta: " + conta.getNumero() + " = " + conta.getSaldo());

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
