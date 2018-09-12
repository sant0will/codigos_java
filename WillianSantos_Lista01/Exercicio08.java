package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double comprimento;
		int numVoltas;
		int numReabas;
		double consumo;
		double totalEspaco;
		double litros;
		
		System.out.println("Digite o comprimento da pista: (em metros).");
		comprimento = Double.parseDouble(in.nextLine());
		System.out.println("Digite o n�mero de voltas do circuito: ");
		numVoltas = Integer.parseInt(in.nextLine());
		System.out.println("Digite o n�mero de reabastecimentos desejados: ");
		numReabas = Integer.parseInt(in.nextLine());
		System.out.println("Digite o consumo de combust�vel do carro (em Km/L).");
		consumo = Double.parseDouble(in.nextLine());
		
		comprimento = comprimento / numReabas;
		comprimento = comprimento / 1000;
		totalEspaco = comprimento * numVoltas;
		litros = totalEspaco / consumo;
		
		System.out.println("Ser� necess�rio "+litros+" litros de combust�vel at� o primeiro reabastecimento.");
		
		in.close();
	}

}
