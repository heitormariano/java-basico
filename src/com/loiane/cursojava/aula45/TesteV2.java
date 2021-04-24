package com.loiane.cursojava.aula45;

public class TesteV2 {

	public static void main(String[] args) {
		Object ob1 = obterString(); // upcasting (obj1 recebe a referência para uma String)
		String s1 = (String) ob1; //downcasting sem erro de compilação ou execução
		
		Object obj2 = "Minha String"; // upcasting (obj2 referência diretamente uma String)
		String s2 = (String) obj2; //downcasting
		
		Object obj3 = new Object(); // upcasting (faz referência a um Object. Não faz referência a uma String)
		//String s3 = (String) obj3; // downcasting (ocorre erro de execução)
		
		Object obj4 = obterInteiro();
		//String s4 = (String) obj4; // ocorre erro de execução
				
	}
	
	public static String obterString() {
		return "minha string legal";
	}

	public static int obterInteiro() {
		return 1;
	}
}
