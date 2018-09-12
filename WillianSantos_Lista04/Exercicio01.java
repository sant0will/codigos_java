package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero posição "+(i+1)+": ");
			vetor[i] = Integer.parseInt(in.nextLine());
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println("Numero "+(i+1)+":"+vetor[i]);
		}
		
		in.close();
	}
}