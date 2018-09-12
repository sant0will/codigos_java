package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		System.out.println("Digite um valor para x: ");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Digite um valor para y: ");
		y = Integer.parseInt(in.nextLine());
		System.out.println("Digite um valor para z: ");
		z = Integer.parseInt(in.nextLine());
		
		double media = (x + y + z) / 3;
		
		System.out.println("A média dos 3 números: "+media);
		in.close();
	}

}
