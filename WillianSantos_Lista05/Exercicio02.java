package br.edu.ifcvideira.Lista05;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(20);
		int menor = 9999;
		int aux = 9999;
		
		for (int i = 0; i < 20; i++) {
			Random ger = new Random();
			numeros.add(ger.nextInt(10));
		}
		
		for (int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++){
				if(numeros.get(j) <= menor){
					menor = numeros.get(j);
				}
			}
			aux = menor;
			numeros.set(i, aux);
			System.out.println(numeros);
		}
		System.out.println("\nOrdem crescente\n");
		System.out.println(numeros.toString());
	}
}