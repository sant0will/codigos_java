package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int vetor[] = new int[12];
		int x;
		int y;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "
					+ " para a posi��o "+(i+1)+": "));
		}
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira a 1�Posi��o para a soma: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Insira a 2�Posi��o para a soma: "));
		
		
		JOptionPane.showMessageDialog(null, vetor[x-1]+" + "+vetor[y-1]+" = "+(vetor[x-1]+vetor[y-1]));
		
		
	}
}
