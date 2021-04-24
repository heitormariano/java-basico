package com.loiane.cursojava.aula52.labs.correcao;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;

	public ContatoNaoExisteException() {

	}

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		String msg = "Contato " + this.nomeContato + " N�o existe na agenda";
		return msg;
	}
}
