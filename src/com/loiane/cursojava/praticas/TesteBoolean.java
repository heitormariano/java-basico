package com.loiane.cursojava.praticas;

public class TesteBoolean {

	private static Boolean isCasado;
	
	public static Boolean getIsCasado() {
		return isCasado;
	}

	public static void setIsCasado(Boolean isCasado) {
		TesteBoolean.isCasado = isCasado;
	}

	public static void main(String[] args) {
	System.out.println("Atribuindo");
	setIsCasado(Boolean.TRUE);
	System.out.println("Resultado: " + getIsCasado());
	
	String texto = "testando <?xml asdakjsdaklsjd";
	if (texto.contains("<?xml")) {
		System.out.println("Tem texto");
	}
	}
}
