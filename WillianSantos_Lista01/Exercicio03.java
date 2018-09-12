package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.println("Digite seu nome: ");
		nome = String.valueOf(in.nextLine());
		System.out.println("Digite sua idade: ");
		idade = Integer.parseInt(in.nextLine());
		System.out.println("Digite seu salário: ");
		salario = Double.parseDouble(in.nextLine());
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
		in.close();
	}

}
