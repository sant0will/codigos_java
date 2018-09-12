package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int qtdLados;
		double lado;
		double area;
		
		System.out.println("Insira o n�mero de lados: ");
		qtdLados = Integer.parseInt(in.nextLine());
		
		if(qtdLados == 3){
			System.out.println("Digite o tamanho do lado do tri�ngulo: ");
			lado = Double.parseDouble(in.nextLine());
			
			area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
			
			System.out.println("Tri�ngulo de �rea: "+area);		
		}else if(qtdLados == 4){
			System.out.println("Digite o tamanho do lado do quadrado: ");
			lado = Double.parseDouble(in.nextLine());
			
			area = Math.pow(lado, 2);
			
			System.out.println("Quadrado de �rea: "+area);	
		}else if(qtdLados == 5){
			System.out.println("Pol�gono");
		}else{
			System.out.println("Quantidade de dados mal fornecida!");
		}
	in.close();
	}
}
