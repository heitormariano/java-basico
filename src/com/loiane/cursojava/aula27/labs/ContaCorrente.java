package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class ContaCorrente {

	double saldo;
	String proprietario;
	String numero;
	String agencia;
	boolean especial;
	double chequeEspecial;

	void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		} else if (saldo < valor) {
			System.out.println("Valor maior que o saldo.");
			if (especial) {
				System.out.println("Usar Cheque Especial? (Sim ou Nao)");
				Scanner scan = new Scanner(System.in);
				String opcao = scan.next();

				if (opcao.equalsIgnoreCase("Sim")) {

					double valorCheque = Math.abs(saldo - valor);
					saldo -= saldo; // zerar o saldo
					usarChequeEspecial(valorCheque);

				} else if (opcao.equalsIgnoreCase("Nao")) {
					System.out.println("Uso de cheque especial cancelado.");
				}
			} else {
				System.out.println("A conta n�o � especial. Saldo Insuficiente.");
			}
		}
	}

	double obterSaldo() {
		return saldo;
	}

	void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("O valor para o dep�sito precisar ser maior que zero.");
		}
	}

	void usarChequeEspecial(double valor) {
		if (chequeEspecial >= valor) {
			chequeEspecial -= valor;
		} else {
			System.out.println("O valor solicitado � maior que o saldo do cheque especial. Saldo atual dispon�vel: R$ " + obterSaldoChequeEspecial());
		}
	}

	double obterSaldoChequeEspecial() {
		return chequeEspecial;
	}
}
