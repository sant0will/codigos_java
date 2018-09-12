package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite o número 1: ");
		num1 = Integer.parseInt(in.nextLine());
		System.out.println("Digite o número 2: ");
		num2 = Integer.parseInt(in.nextLine());
		
		if(num1 < num2){
			while (num1 < (num2 - 1)){
				num1++;
				System.out.print(num1+" ");
			}	
		}else if(num1 > num2){
			while (num1 > (num2 + 1)){
				num2++;
				System.out.print(num2+" ");
			}
		}else{
			System.out.println("Números iguais!");
		}
		in.close();
	}
}