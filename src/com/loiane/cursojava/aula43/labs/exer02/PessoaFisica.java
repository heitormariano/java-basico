package com.loiane.cursojava.aula43.labs.exer02;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}
	
	

	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double alicota;
		double imposto = 0;
		double rendaBruta = this.getRendaBruta();

		if (rendaBruta >= 0 && rendaBruta <= 1400) {
			alicota = 0.0; // 0%
			imposto = (rendaBruta * alicota);  //(parcela a deduzir: R$ 0)
		} else if (rendaBruta > 1400 && rendaBruta <= 2100) {
			alicota = 0.1; // 10%
			imposto = (rendaBruta * alicota) - 100; //(parcela a deduzir: R$ 100)
		} else if (rendaBruta > 2100 && rendaBruta <= 2800) {
			alicota = 0.15; // 15%
			imposto =  (rendaBruta * alicota) - 270;  // (parcela a deduzir: R$ 270)
		} else if (rendaBruta > 2800 && rendaBruta <= 3600) {
			alicota = 0.25; // 25%
			imposto = (rendaBruta * alicota) - 500; //(parcela a deduzir: R$ 500)
		} else if (rendaBruta > 3600) {
			alicota = 0.30; // 30%
			imposto = (rendaBruta * alicota) - 700; //(parcela a deduzir: R$ 700)
		}

		return imposto;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pessoa Física [");
		sb.append(super.toString());
		sb.append(", CPF:" + this.cpf);
		sb.append(", imposto a ser pago:" + this.calcularImposto());
		sb.append("]");

		return sb.toString();
	}
}
