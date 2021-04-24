package com.loiane.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {

	public AgendaCheiaException(){
		super("Agenda cheia. Não é possível adicionas novos contatos");
	}
}
