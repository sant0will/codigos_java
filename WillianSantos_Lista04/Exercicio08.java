package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio08 {
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		String msg = "";
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "+(i+1)+":"));
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == 0){		
				vetor[i] = vetor[i+1];
				vetor[i+1] = 0;
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			msg += "Posição "+i+" = "+vetor[i]+"\n";
		}
		
		System.out.println(msg);
	}
}


