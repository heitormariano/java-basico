package com.loiane.cursojava.aula52.labs.correcao;

public class Agenda {
	private Contato[] contatos;

	public Agenda() {
		this.contatos = new Contato[5]; // tamanho fixo
	}

	public void adicionarContato(Contato contato) throws AgendaCheiaException {
		// forma simples (sem controle de tamanho da agenda)
		boolean cheia = true;
		for (int i = 0; i < this.contatos.length; i++) {
			if (this.contatos[i] == null) {
				this.contatos[i] = contato;
				cheia = false;
				break;
			}
		}

		if (cheia) {
			throw new AgendaCheiaException();
		}
	}

	public int consultarContato(String nome) throws ContatoNaoExisteException {
		for (int i = 0; i < this.contatos.length; i++) {
			if (this.contatos[i] != null) {
				if (this.contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException(nome);
	}

	public Contato consultarContato(int indice) throws IndiceInvalidoException {
		if (indice >= 0 && indice < this.contatos.length) {
			if (this.contatos[indice] != null) {
				return this.contatos[indice];
			} else {
				throw new IndiceInvalidoException("Não existe contato com o índice informado");
			}
		}
		throw new IndiceInvalidoException("Índice fora da faixa permitida");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Contato contato : this.contatos) {
			if (contato != null) {
				sb.append(contato.toString());
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
