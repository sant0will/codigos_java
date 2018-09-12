package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio18 {
	public static void main(String[] args) {
		int matriz[][] = new int [3][5];
		String msg = "Matriz para Calculo \n";
		int det01 = 1;
		int det02 = 1;
		int det03 = 1;
		int det04 = 1;
		int det05 = 1;
		int det06 = 1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(j >= 3){
					matriz[i][j] = matriz[i][j-3];
				}else{
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor da posição ("+(i+1)+", "+(j+1)+"):"));
				}
				msg += matriz[i][j]+ "     ";
			}
			msg += "\n";
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(i + j == 2){
					det01 *= matriz[i][j];
				}else if(i + j == 3){
					det02 *= matriz[i][j];
				}else if(i + j == 4){
					det03 *= matriz[i][j];
				}
				
				if(i == j){
					det04 *= matriz[i][j];
				}else if(j - i == 1){
					det05 *= matriz[i][j];
				}else if(j - i == 2){
					det06 *= matriz[i][j];
				}
			}
		}
		
		
		int total = -(det01+det02+det03)+(det04)+(det05)+(det06);
		msg += "\ndet = - ("+det01+" + "+det02+" + "+det03+") + ("+det04+") +  ("+det05+") + ("+det06+")";
		msg += "\ndet = "+(det01+det02+det03)+" +/- "+((det04)+(det05)+(det06));
		msg += "\ndet = "+total;
		JOptionPane.showMessageDialog(null, msg);
	}
}
