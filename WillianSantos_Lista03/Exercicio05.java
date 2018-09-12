package br.edu.ifcvideira.Lista03;

public class Exercicio05 {
	public static void main(String[] args) {
		int i;
		int primo = 0;
		for (i = 100; i < 1000; i++) {
			if(1000 % i == 0){
				primo += 1;
			}
			if(primo == 0){
				System.out.println("Número primo =>"+i);
			}
		}
	}
}
