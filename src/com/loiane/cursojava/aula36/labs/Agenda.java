package com.loiane.cursojava.aula36.labs;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	private int tamanho;

	public Agenda() {
		this.tamanho = 0;
		this.contatos = new Contato[10];
	}

	public boolean adicionarContato(Contato contato) throws Exception {
		this.aumentaCapacidade();

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

	public int buscarContato(Contato contato) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.contatos[i].equals(contato)) {
				return i;
			}
		}
		return -1;
	}

	public Contato buscarContato(int indice) {
		if (!isPosicaoValida(indice)) {
			throw new IllegalArgumentException("indice inválido");
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

	private void aumentaCapacidade() {
		if (this.tamanho == this.contatos.length) {
			Contato[] contatosNovos = new Contato[this.contatos.length * 2];
			for (int i = 0; i < this.contatos.length; i++) {
				contatosNovos[i] = this.contatos[i];
			}
			this.contatos = contatosNovos;
		}
	}

	public String imprimirContato(int indice) {
		Contato contato = buscarContato(indice);
		return contato.toString();
	}

	public String imprimirTodosContatos() {
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
