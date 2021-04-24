package com.loiane.cursojava.aula44;

public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

	private String raca;

	public Gato() {

	}

	public Gato(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {

	}

	@Override
	public void emitirSom() {

	}

	@Override
	public void brincar() {

	}

	@Override
	public void levarPassear() {

	}

	@Override
	public void levarVeterinario() {

	}

	@Override
	public void alimentar() {

	}
}
