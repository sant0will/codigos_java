package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		String sexo;
		double salario;
		int cont = 0;
		double totalSalario = 0;
		int menorIdade = 110;
		int maiorIdade = 0;
		int contMulheres = 0;
		
		do{
			System.out.println("Forneça a idade: Idade negativa para finalizar!");
			idade = Integer.parseInt(in.nextLine());
			if(idade < 0){
				break;
			}
			System.out.println("Forneça o sexo: M - Masculino / F - Feminino");
			sexo = String.valueOf(in.nextLine());
			System.out.println("Forneça o salário: ");
			salario = Double.parseDouble(in.nextLine());
			//Salario
			totalSalario += salario;
			cont++;
			
			
			//Menor idade
			if(menorIdade > idade){
				menorIdade = idade;
			}
			
			//Maior idade
			if(maiorIdade < idade){
				maiorIdade = idade;
			}
			
			if(!sexo.equalsIgnoreCase("m")&& salario <= 2000){
				contMulheres++;				
			}	
		}while(idade > 0);
		
		System.out.println("Média de salarios: "+(totalSalario / cont));
		System.out.println("Menor Idade: "+menorIdade);
		System.out.println("Maior Idade: "+maiorIdade);
		System.out.println("Numero de mulheres que ganham até R$2000.00: "+contMulheres);
		in.close();
	}
}