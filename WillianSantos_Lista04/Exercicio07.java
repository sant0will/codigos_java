package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static void main(String[] args) {
		int vetor[] = new int[10];
		String msg = "";
		float flag = 0;
		float flag1 = 1;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" valor:"));
		}
		
		for (int j = 0; j < vetor.length; j++) {
			flag = 0;
			flag1 = 1;
			for (int i = 0; i < vetor.length; i++) {
				if(vetor[j] == vetor[i] && j != i && flag != flag1){
					msg += "Posição "+(i+1)+" igual á posição "+(j+1)+" -> ("+vetor[i]+" = "+vetor[j]+")\n";
					flag = vetor[j]+(vetor[i]/2);
					flag1 = vetor[j]+(vetor[i]/2);
				}else{
			
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}


