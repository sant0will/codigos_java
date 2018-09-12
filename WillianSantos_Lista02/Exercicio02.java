package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		double preco = 0;
		
		System.out.println("Forneça a quantidade de maças: ");
		num = Integer.parseInt(in.nextLine());
		
		if(num <= 11){
			preco = num * 0.3;
		}else{
			preco = num * 0.25;			
		}
		System.out.println(num+" Maças por: R$"+preco);
		in.close();
	}
}			