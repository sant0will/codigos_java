package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double altura;
		double parede1;
		double parede2;
		double chao;
		double area;
		double caixas;
		
		System.out.println("Digite a largura da cozinha");
		largura = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento da cozinha");
		comprimento = Double.parseDouble(in.nextLine());
		System.out.println("Digite a altura da cozinha");
		altura = Double.parseDouble(in.nextLine());
		
		parede1 = 2 * comprimento * altura;
		parede2 = 2 * largura * altura;
		chao = comprimento * largura;
		area = parede1 + parede2 + chao;
		caixas = area / 1.5;
		
		System.out.println("Numero de caixas: "+caixas);
		
		in.close();
	}

}
