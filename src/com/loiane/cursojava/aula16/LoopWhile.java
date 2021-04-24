package com.loiane.cursojava.aula16;

public class LoopWhile {
	public static void main(String[] args) {
		
		int i = 1; //count ou cont
		int max = 10; 
		System.out.println("Contando ate " + max);
		
		while(i <= max){
			System.out.println("O valor de i = " + i);
			i++; // i = i +1;  i+=1;
		}
		
		System.out.println("Fora do While. Valor de i = " + i); // i = 11
		System.out.println();
		
		do{
			i++;
			System.out.println("Do ... While. O valor de i = " + i);
		}while(i < 15);
		
		System.out.println("Fora do 'Do...while'. Valor de i = " + i); 
	}
}
