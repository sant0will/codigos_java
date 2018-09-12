package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	
	double saldo = 0;
	String opcao = "";
	
	do{
		System.out.println("-------------------------------- Banco ----------------------------");
		System.out.println("(a) consulta saldo - (b) saque"
				+ "  (c) depósito - (e) sair");
		opcao = String.valueOf(in.nextLine());
		
		if(opcao.equalsIgnoreCase("a")){
			System.out.println("Saldo -> "+saldo);
		}else if(opcao.equalsIgnoreCase("b")){
			double saque = 0;
			System.out.println("Valor do saque: ");
			saque = Double.parseDouble(in.nextLine());
			saldo -= saque;
			if(saldo < 0){
				System.out.println("Saldo indisponivel");
				saldo +=saque;
			}else{
			System.out.println("Saldo -> "+saldo);
			}
		}else if(opcao.equalsIgnoreCase("c")){
			double deposito = 0;
			System.out.println("Valor do deposito: ");
			deposito = Double.parseDouble(in.nextLine());
			saldo += deposito;
			System.out.println("Saldo -> "+saldo);
		}
		
	}while(!opcao.equalsIgnoreCase("e"));
	System.out.println("Saindo...");
	in.close();
	}
}