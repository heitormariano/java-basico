package com.loiane.cursojava.aula45;

public class TesteV2 {

	public static void main(String[] args) {
		Object ob1 = obterString(); // upcasting (obj1 recebe a refer�ncia para uma String)
		String s1 = (String) ob1; //downcasting sem erro de compila��o ou execu��o
		
		Object obj2 = "Minha String"; // upcasting (obj2 refer�ncia diretamente uma String)
		String s2 = (String) obj2; //downcasting
		
		Object obj3 = new Object(); // upcasting (faz refer�ncia a um Object. N�o faz refer�ncia a uma String)
		//String s3 = (String) obj3; // downcasting (ocorre erro de execu��o)
		
		Object obj4 = obterInteiro();
		//String s4 = (String) obj4; // ocorre erro de execu��o
				
	}
	
	public static String obterString() {
		return "minha string legal";
	}

	public static int obterInteiro() {
		return 1;
	}
}
