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
		
		System.out.println("Digite a pot�ncia da lampada utilizada: ");
		potencia = Integer.parseInt(in.nextLine());
		System.out.println("Digite a largura do c�modo");
		largura = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento do c�modo");
		comprimento = Double.parseDouble(in.nextLine());
		
		area = largura * comprimento;
		potenciaNes = area * 18;
		numLampadas = potenciaNes / potencia;
		
		System.out.println("N�mero de lampadas necess�rias: "+numLampadas);
		in.close();
	}
}
