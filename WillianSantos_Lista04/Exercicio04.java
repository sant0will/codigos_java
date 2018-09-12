package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[] args) {
		
		int vetor[] = new int[20];
		int x;
		int cont = 0;
		String msg = "";
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "
					+ " para a posição "+(i+1)+": "));
		}
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero que deseja procurar: "));
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == x){
				msg += "Posição "+(i+1)+" = "+vetor[i]+"\n";
				cont++;
			}
		}
		
		if(cont != 0){
			JOptionPane.showMessageDialog(null,msg);
			JOptionPane.showMessageDialog(null,"Total = "+cont);
		}else{
			JOptionPane.showMessageDialog(null,"Nenhum número encontrado!");
		}

	}
}