package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double altura;
		String sexo;
		double maiorAltura = 0;
		double menorAltura = 3;
		double somaAltFem = 0;
		double quantFem = 0;
		int i;
		
		for (i = 0; i < 10; i++) {
			System.out.println("Qual o sexo da pessoa "+(i+1)+"(M ou F):");
			sexo = String.valueOf(in.nextLine());
			System.out.println("Qual a altura da pessoa "+(i+1)+":");
			altura = Double.parseDouble(in.nextLine());
			
			if(maiorAltura < altura){
				maiorAltura = altura;
			}
			if(menorAltura > altura){
				menorAltura = altura;
			}
			if(sexo.equalsIgnoreCase("f")){
				somaAltFem += altura;
				quantFem++;
				
			}else if(sexo.equalsIgnoreCase("m")){
			
			}else{
				System.out.println("Sexo inválido!");
			}
		}
		System.out.println("Maior altura: "+maiorAltura);
		System.out.println("Menor altura: "+menorAltura);
		System.out.println("Media de altura das mulheres: "+(somaAltFem/quantFem));
		System.out.println("Porcentagem de homens: "+(((i - quantFem)/i)*100)+"%");
		in.close();
	}
}