package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		int cont = 0;
		double media = 0;
		double somaIdade = 0;
		
		do{
			System.out.println("Insira a idade: ");
			idade = Integer.parseInt(in.nextLine());		
			if(idade == 0){
				System.out.println("Números de idades lidas: "+cont);
				System.out.println("Média de idade: "+media);
				System.out.println("Saindo...");
				break;
			}
			cont++;
			somaIdade += idade;
			media = somaIdade / cont;
		}while(1 > 0);
		in.close();
	}

}
