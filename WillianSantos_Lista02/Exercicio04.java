package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int qtdLados;
		double lado;
		double area;
		
		System.out.println("Insira o número de lados: ");
		qtdLados = Integer.parseInt(in.nextLine());
		
		if(qtdLados == 3){
			System.out.println("Digite o tamanho do lado do triângulo: ");
			lado = Double.parseDouble(in.nextLine());
			
			area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
			
			System.out.println("Triângulo de área: "+area);		
		}else if(qtdLados == 4){
			System.out.println("Digite o tamanho do lado do quadrado: ");
			lado = Double.parseDouble(in.nextLine());
			
			area = Math.pow(lado, 2);
			
			System.out.println("Quadrado de área: "+area);	
		}else if(qtdLados == 5){
			System.out.println("Polígono");
		}else{
			System.out.println("Quantidade de dados mal fornecida!");
		}
	in.close();
	}
}
