package com.loiane.cursojava.aula52.labs;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	private int tamanho;

	public Agenda() {
		this.tamanho = 0;
		this.contatos = new Contato[10];
	}

	public Agenda(int qtdContatos) {
		this.tamanho = 0;
		this.contatos = new Contato[qtdContatos];
	}

	public boolean adicionarContato(Contato contato) throws AgendaCheiaException{
		if (this.tamanho == this.contatos.length) {
			throw new AgendaCheiaException();
		}

		this.contatos[this.tamanho] = contato;
		this.tamanho++;
		return true;
	}

	public boolean removerContato(int indice) {
		if (!isPosicaoValida(indice)) {
			throw new IllegalArgumentException("indíce inválido");
		}

		for (int i = indice; i < this.tamanho - 1; i++) {
			this.contatos[i] = this.contatos[i + 1];
		}

		if (this.tamanho > 0) {
			this.contatos[tamanho - 1] = null;
		}
		this.tamanho--;
		return true;
	}

	public boolean removerContato(Contato contato) throws Exception {
		int posicao = buscarContato(contato);

		if (posicao > -1) {
			return removerContato(posicao);

		} else {
			throw new Exception("Elemento não existe");
		}

	}

	public int buscarContato(Contato contato) throws ContatoNaoExisteException {
		int indice = -1;

		for (int i = 0; i < this.tamanho; i++) {
			if (this.contatos[i].equals(contato)) {
				indice = i;
			}
		}

		if (indice > -1) {
			return indice;
		} else {
			throw new ContatoNaoExisteException();
		}
	}

	public Contato buscarContato(int indice) throws ContatoNaoExisteException {
		if (!isPosicaoValida(indice)) {
			throw new ContatoNaoExisteException();
		}
		return this.contatos[indice];
	}

	private boolean isPosicaoValida(int indice) {
		if (indice >= 0 && indice < this.tamanho) {
			return true;
		}
		return false;
	}

	public int obterTamanho() {
		return this.tamanho;
	}

	public String imprimirContato(int indice) throws ContatoNaoExisteException {
		Contato contato = buscarContato(indice);
		return contato.toString();
	}

	public String imprimirTodosContatos() throws ContatoNaoExisteException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.tamanho; i++) {
			if (i != this.tamanho - 1) {
				sb.append(this.buscarContato(i));
				sb.append("\n");
			} else {
				sb.append(this.buscarContato(i));
			}
		}
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

}
