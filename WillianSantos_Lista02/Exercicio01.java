package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String senha;
		
		System.out.println("Forneça a senha: ");
		senha = String.valueOf(in.nextLine());
		
		if(senha.equals("1234")){
			System.out.println("ACESSO PERMITDO!");
		}else{
			System.out.println("ACESSO NEGADO!");
		}
		in.close();
	}
}