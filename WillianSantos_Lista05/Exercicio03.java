package br.edu.ifcvideira.Lista05;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		String numeros = "4;5;3;8;9;6;2;1";
		int menor = 10;
		int maior = 0;
		
		for (int i = 0; i < 8; i++) {
			String vetor[] = numeros.split(";");
			if(Integer.parseInt(vetor[i]) > maior){
				maior = Integer.parseInt(vetor[i]);				
			}
			if(Integer.parseInt(vetor[i]) < menor){
				menor = Integer.parseInt(vetor[i]);				
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior número: "+maior+"\n"
				+ "Menor número: "+menor);
	}
}