package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
	
		int vetor[] = new int[16];
		int aux;
		String msg = "";
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "
					+ " para a posição "+(i+1)+": "));
		}
		
		for (int i = 0; i < 8; i++) {
			aux = vetor[i];
			vetor[i] = vetor[i+8];
			vetor[i+8] = aux;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			msg += "Posição "+(i+1)+": "+vetor[i]+"\n";
		}	
		JOptionPane.showMessageDialog(null, msg);
	}
}