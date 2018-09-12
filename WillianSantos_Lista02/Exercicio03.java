package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sexo;
		double altura;
		double peso = 0;
		
		System.out.println("Forneça o sexo: 1 - Masculino / 2 - Feminino");
		sexo = Integer.parseInt(in.nextLine());
		System.out.println("Forneça a altura: ");
		altura = Double.parseDouble(in.nextLine());
		
		if(sexo == 1){
			peso = (72.7 * altura) - 58;
		}else if(sexo == 2){
			peso = (62.1 * altura) - 44.7;
		}else{
			System.out.println("O sexo fornecido está incorreto!");
		}
		
		System.out.println("O peso ideal para essa pessoa: "+peso);
		
		in.close();
	}
}