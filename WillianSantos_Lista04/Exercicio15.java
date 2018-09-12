package br.edu.ifcvideira.Lista04; 

import javax.swing.JOptionPane;

public class Exercicio15 {
	public static void main(String[] args) {
		Double matriz[][] = new Double [50][2];
		Double matrizArea[] = new Double [50];
		String msg = "Matriz de medidas \n";
		
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 2; j++) {
				matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Valor do lado "+(i+1)+" do "+(j+1)+" triiangulo retangulo: "));
				
				msg += matriz[i][j]+ "      ";
			}
			msg += "\n";
		}
		msg += "\n";
		msg += "Vetor com as áreas \n";
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 1; j++) {
				matrizArea[i] = (matriz[i][j] * matriz[i][j+1]) / 2;
				msg += matrizArea[i]+ "   ";
			}
			msg += "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}