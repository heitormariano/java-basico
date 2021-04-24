package com.loiane.cursojava.aula52.labs.correcao;

public class AgendaCheiaException extends Exception {

	@Override
	public String getMessage() {
		String msg = "Agenda já está cheia";
		return msg;
	}
}
