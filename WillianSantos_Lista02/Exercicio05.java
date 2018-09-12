package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lado01;
		int lado02;
		int lado03;
		
		
		System.out.println("Forneça o lado 01: ");
		lado01 = Integer.parseInt(in.nextLine());
		System.out.println("Forneça o lado 02: ");
		lado02 = Integer.parseInt(in.nextLine());
		System.out.println("Forneça o lado 03: ");
		lado03 = Integer.parseInt(in.nextLine());
		
		if(lado01 == lado02 && lado01 == lado03){
			System.out.println("TRIÂNGULO EQUÍLATERO");
		}else if(lado01 == lado02 && lado01 != lado03 || lado01 == lado03 && lado01 != lado02){
			System.out.println("TRIÂNGULO ISÓCELES");
		}else if(lado01 != lado02 && lado01 != lado03){
			System.out.println("TRIÂNGULO ESCALENO");
		in.close();
	}
}
}