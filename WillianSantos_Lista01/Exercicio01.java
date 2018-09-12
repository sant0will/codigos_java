package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Digite um valor para x: ");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Digite um valor para y: ");
		y = Integer.parseInt(in.nextLine());
		
		double result = x / y;
		double resto = x % y;
		
		System.out.println("O quociente da divisão "+x+"/"+y+" => "+result+" \nResto: "+resto);
	in.close();
	}
	
	

}
