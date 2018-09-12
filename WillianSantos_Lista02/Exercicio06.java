package br.edu.ifcvideira.Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double densidade;
		double massa;
		double volume;
		double preco;

		System.out.println("Digite a densidade do leite:");
		densidade = Double.parseDouble(in.nextLine());

		System.out.println("Digite a massa do leite:");
		massa = Double.parseDouble(in.nextLine());

		System.out.println("Digite o preço do leite:");
		preco = Double.parseDouble(in.nextLine());

		volume = massa / densidade;

		System.out.println("Dados do leite:\n" +
		"Densidade: "+densidade+"\n" +
		"Massa: "+massa+"\n" +
		"Volume: "+df.format(volume)+"\n" +
		"Preco Total: R$"+df.format(volume*preco)+"\n");

		if (volume < 1.14){
			System.out.println("Classificação: Categoria 1");
		}else if ((volume >= 1.14)&&(volume <= 1.20)){
			System.out.println("Classificação: Categoria 2"); 
		}else{
			System.out.println("Classificação: Categoria 3");
		}
		in.close();
	}
}
