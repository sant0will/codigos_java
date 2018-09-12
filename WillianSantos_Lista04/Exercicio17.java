package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio17 {
	public static void main(String[] args) {
		String matriz[][] = new String[100][10];
		String msg = "Matriz com as notas \n";
		String gabarito[] = new String[10];
		int notas[] = new int[100];
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				matriz[i][j] = String.valueOf(JOptionPane.showInputDialog("Aluno "+(i+1)+"\nQuestão "+(j+1)+": "));
				
				msg += matriz[i][j]+"    ";
			}
			msg += "\n";
		}
		
		msg += "\nGabarito\n";
		
		for (int i = 0; i < 10; i++) {
			gabarito[i] = String.valueOf(JOptionPane.showInputDialog("Questão "+(i+1)+": "));
			msg += gabarito[i]+"   ";
		}
		msg += "\n";
		msg += "\nNotas \n";
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				if(matriz[i][j].equalsIgnoreCase(gabarito[j])){
					notas[i]++;
				}
			}
			msg += "Aluno "+(i+1)+" = "+notas[i]+"\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
