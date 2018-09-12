package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio16 {
	public static void main(String[] args) {
		int matriz[][] = new int [8][8];
		int matrizFinal[][] = new int[8][8];
		String msg = "Matriz Principal \n";
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor da posição ("+(i+1)+", "+(j+1)+"):"));
				
				msg += matriz[i][j]+ "      ";
			}
			msg += "\n";
		}
		
		msg += "Matriz Final \n";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((j - i == 1)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 2)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 3)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 4)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 5)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 6)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 7)){
					matrizFinal[i][j] = 0;
				}else if((j - i == 8)){
					matrizFinal[i][j] = 0;
				}else{
					matrizFinal[i][j] = matriz[i][j];
				}
				
				msg += matrizFinal[i][j]+ "      ";
			}
			msg += "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
}
