package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio14 {
	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		String msg = "";
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j){
					matriz[i][j] = 1;
				}else{
					matriz[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				msg += matriz[i][j]+"    ";
			}
			msg += "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
