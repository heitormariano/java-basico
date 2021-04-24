package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Lucas");

		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua A");
		endereco.setNumero("123");
		endereco.setCidade("Cidade A");
		endereco.setEstado("Brasil");
		endereco.setCep("121.222-33");
		endereco.setComplemento("Supermercado Show de Bola");

		// definindo o endereço no objeto Contato
		contato.setEndeco(endereco);

		Telefone telefone1 = new Telefone();
		telefone1.setTipo("celular");
		telefone1.setNumero("98898-5665");
		telefone1.setDdd("84");

		Telefone telefone2 = new Telefone();
		telefone2.setTipo("residencial");
		telefone2.setNumero("3258-3322");
		telefone2.setDdd("84");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		// definindo a lista de contatos no objeto Contato
		contato.setTelefones(telefones);

		if (contato != null) {
			System.out.println("Nome contato: " + contato.getNome());
		}

		if (contato != null && contato.getEndeco() != null) {
			System.out.println("Dados do Endereço");
			System.out.println(contato.getEndeco().getNomeRua());
			System.out.println(contato.getEndeco().getNumero());
			System.out.println(contato.getEndeco().getCidade());
			System.out.println(contato.getEndeco().getEstado());
			System.out.println(contato.getEndeco().getComplemento());
			System.out.println(contato.getEndeco().getCep());
		}

		if (contato != null && contato.getTelefones() != null && contato.getTelefones().length != 0) {
			System.out.println("Telefones:");
			for (Telefone tel : contato.getTelefones()) {
				System.out.println(tel.getDdd() + "-" + tel.getNumero());
			}
		}
	}
}
