package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int potencia;
		double largura;
		double comprimento;
		double area;
		double numLampadas;
		double potenciaNes;
		
		System.out.println("Digite a potência da lampada utilizada: ");
		potencia = Integer.parseInt(in.nextLine());
		System.out.println("Digite a largura do cômodo");
		largura = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento do cômodo");
		comprimento = Double.parseDouble(in.nextLine());
		
		area = largura * comprimento;
		potenciaNes = area * 18;
		numLampadas = potenciaNes / potencia;
		
		System.out.println("Número de lampadas necessárias: "+numLampadas);
		in.close();
	}
}
