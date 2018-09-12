package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		
		int vetor[] = new int[40];
		String msg = "";
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "
					+ " para a posição "+(i+1)+": "));
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0){
				vetor[i] = 0;
				msg += "Posição "+(i+1)+" = "+vetor[i]+"\n";
			}else{
				msg += "Posição "+(i+1)+" = "+vetor[i]+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}