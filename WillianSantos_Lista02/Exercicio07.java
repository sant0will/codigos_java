package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numTelefone;
		int tipo;
		int minLocais;
		int minInterurbanos;
		double tarifaBasica = 0;
		double valorConta = 0;
		double valorContaFinal = 0;
		double fnt = 0;
		double valorLocal = 0;
		double valorInterurbano = 0;
		
		System.out.println("Digite o número de telefone: ");
		numTelefone = Integer.parseInt(in.nextLine());
		System.out.println("Digite o tipo do telefone: 1 - Residencial / 2 - Comercial");
		tipo = Integer.parseInt(in.nextLine());
		System.out.println("Digite os minutos para ligações locais: ");
		minLocais = Integer.parseInt(in.nextLine());
		System.out.println("Digite os minutos para ligações interurbanas: ");
		minInterurbanos = Integer.parseInt(in.nextLine());
		
		if(tipo == 1){
			tarifaBasica = 10.20;
		}else if(tipo == 2){
			tarifaBasica = 19.50;
		}else{
			System.out.println("O tipo de telefone inválido!!!"
					+ "Saindo...");
			
		}
		
		valorLocal = minLocais * 0.50;
		valorInterurbano = minInterurbanos * 1.10;
		valorConta = tarifaBasica + valorInterurbano + valorLocal;
		fnt = valorConta * 0.30;
		valorContaFinal = valorConta + fnt;
		
		System.out.println("Telefone "+numTelefone);
		System.out.println("Tipo da linha: "+tipo);
		System.out.println("Valor das ligaçõs locais: "+valorLocal);
		System.out.println("Valor das ligaçõs interurbanas: "+valorInterurbano);
		System.out.println("Valor da conta: "+valorConta);
		System.out.println("Valor do imposto FNT:"+fnt);
		System.out.println("Valor final da conta: "+valorContaFinal);
		
		in.close();
	}
}