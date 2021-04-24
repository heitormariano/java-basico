package com.loiane.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {
	
	public ContatoNaoExisteException(){
		super("Contato não encontrado");
	}
}
