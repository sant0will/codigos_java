package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.println("Digite o raio do c�rculo: ");
		raio = Double.parseDouble(in.nextLine());
		
		area = Math.PI * (raio * raio);
		
		System.out.println("Area do c�rculo: "+area);
		in.close();
	}

}
