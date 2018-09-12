package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valorHoras;
		int numHoras;
		double salarioBruto;
		double salarioLiquido;
		double INSS;
		double sindicato;
		
		System.out.println("Digite o valor das horas:");
		valorHoras = Double.parseDouble(in.nextLine());
		System.out.println("Digite o número de horas trabalhadas: ");
		numHoras = Integer.parseInt(in.nextLine());
		
		salarioBruto = valorHoras * numHoras;
		INSS = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - (salarioBruto * 0.24);
		
		System.out.println("Salário Bruto: R$"+salarioBruto);
		System.out.println("INSS: R$"+INSS);		
		System.out.println("Sindicato: R$"+sindicato);
		System.out.println("Salário Liquido: R$"+salarioLiquido);
		
		in.close();
	}

}
