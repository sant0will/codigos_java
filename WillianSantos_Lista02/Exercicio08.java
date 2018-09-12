package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int numKey;
		int resposta;
		
		System.out.println("Digite o n�mero chave: ");
		numKey = Integer.parseInt(in.nextLine());
		System.out.println("Digite o n�mero que deseja procurar: ");
		num = Integer.parseInt(in.nextLine());
		
		if ((numKey < 0 || numKey > 100)||(num < 0 || num > 100)){
			System.out.println("N�mero inv�lido!"
					+ "Saindo...");
		}
		
		resposta = numKey - num;
		
		if(resposta < 0){
			resposta *= -1;
		}
		
		System.out.println("Diferen�a entre "+numKey+" e "+num+" => "+resposta);
		
		in.close();
	}
}
