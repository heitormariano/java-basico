package com.loiane.cursojava.aula51;

public class AulaTeorica {

	public static void main(String[] args) {
		System.out.println("Aula Teórica sobre Errors e Exceptions");
		System.out.println("Diferença entre exceptions 'checked' e 'unchecked'");
		System.out.println("Checked: É obrigatório realizar o tratatamento da exceção." 
				+ "\nNesse caso é usado o try/catch ou apenas throws (tratamento feito em outro ponto do código)");
		System.out.println("Unchecked: Não é obrigatório o tratamento da exceção. "
				+ "\nIsso é feito caso seja de interesse do programador (e responda melhor as exceções)");
	}
}
