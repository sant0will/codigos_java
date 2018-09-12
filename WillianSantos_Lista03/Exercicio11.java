package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valorSaque = 0;
		int notas50 = 0;
		int notas10 = 0;
		int notas5 = 0;
		int notas2 = 0;
		
		System.out.println("Informe o valor do saque: ");
		valorSaque = Double.parseDouble(in.nextLine());
		do{
			if(valorSaque >= 50){
				valorSaque -= 50;
				notas50++;
			}else if(valorSaque >= 10){
				valorSaque -= 10;
				notas10++;
				}else if(valorSaque >= 5 && valorSaque % 2 == 1){
					valorSaque -= 5;
					notas5++;
					}else if(valorSaque >= 2){
						valorSaque -= 2;
						notas2++;
					}
		}while(valorSaque > 0);
		
		System.out.println("Notas  50  10  5  2");
		System.out.println("       "+notas50+"   "+notas10+"   "+notas5+"  "+notas2);
		in.close();
	}

}
