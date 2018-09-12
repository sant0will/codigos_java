package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String letra;
		String n1 = "", n2;
		int cont = 0;
		do{
			System.out.println("Digite uma letra: ");
			letra = String.valueOf(in.nextLine());
			n2 = n1;
			n1 = letra;
			
			if(n1.equalsIgnoreCase(n2)){
				cont++;
			}
		}while(!letra.equalsIgnoreCase("x"));
		
		System.out.println("Numero de vezes q se digitou letras iguais 2 vezes: "+cont);	
		
		in.close();
	}

}
