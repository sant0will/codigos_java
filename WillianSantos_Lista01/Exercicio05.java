package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double celsius;
		double fahrenheit;
		
		System.out.println("Digite a temperatura em Fahrenheit: ºF");
		fahrenheit = Double.parseDouble(in.nextLine());
		
	celsius = ((fahrenheit - 32) / 9) * 5;
	 
	
	System.out.println("Temperatura "+celsius+" ºC");
	in.close();
	}

}
