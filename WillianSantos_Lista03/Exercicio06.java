package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = Integer.parseInt(in.nextLine());
		int i = num;
		while(i > 0){
			if(num % i == 0){
				System.out.println(num+" / "+i+" = "+num/i+" ==> resto 0");
			}
		i--;
		}
		in.close();
	}

}