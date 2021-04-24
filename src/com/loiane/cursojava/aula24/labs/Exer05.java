package com.loiane.cursojava.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();

		conta.numero = "1234-5";
		conta.agencia = "45568-9";
		conta.proprietario = "Heitor";
		conta.statusContaEspecial = true;
		conta.limiteChequeEspecial = 6_789.88;
		conta.saldo = 500.65;

		System.out.println("Dados da Conta Corrente");
		System.out.println("Número: " + conta.numero);
		System.out.println("Agência: " + conta.agencia);
		System.out.println("Proprietário: " + conta.proprietario);
		System.out.println("Conta especial? " + (conta.statusContaEspecial ? "Sim" : "Não"));
		System.out.println("Limite Cheque Especial: " + conta.limiteChequeEspecial);
		System.out.println("Saldo: " + conta.saldo);
	}
}
