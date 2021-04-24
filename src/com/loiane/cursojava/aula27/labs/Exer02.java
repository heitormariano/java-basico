package com.loiane.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.proprietario = "Felipe da Silva";
		conta.numero = "1234-5";
		conta.agencia = "56567-8";
		conta.especial = true;
		conta.chequeEspecial = 2500.00;
		conta.saldo = 100;

		System.out.println("Depósito de R$ 300,00");
		conta.depositar(300.00);
		System.out.println("Saldo da Conta: " + conta.obterSaldo());
		System.out.println("Saque de R$ 200,00");
		conta.sacar(200.00);
		System.out.println("Saque de R$ 40,00");
		conta.sacar(40.00);
		System.out.println("Saldo da Conta:" + conta.obterSaldo());
		System.out.println("Saque de 450,00");
		conta.sacar(450.00);
		System.out.println("Saldo da Conta: " + conta.obterSaldo());
		System.out.println("Saque de 2210,50");
		conta.sacar(2210.50);

	}
}
