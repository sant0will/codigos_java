package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		double fat = 1;
		
		System.out.println("Número para calcular fatorial: ");
		num = Integer.parseInt(in.nextLine());
		
		do{
			System.out.print(num+" * ");
			fat *= num; 
			num--;		
		}while(num > 1);
			
		System.out.print("1 = "+fat);
		
		in.close();
	}

}
