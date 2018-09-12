package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio12 {
	public static void main(String[] args) {
		int matrizSoma[][] = new int [10][10];
		int matrizMult[][] = new int [10][10];
		String msg = "";
		
		
	//preenchimento matriz soma
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma.length; j++) {
				matrizSoma[i][j] = i + j;
			}
		}
		
	//preenchimento matriz multiplicação
		for (int i = 0; i < matrizMult.length; i++) {
			for (int j = 0; j < matrizMult.length; j++) {
				matrizMult[i][j] = i * j;
			}
		}	
		
	//Mensagem matriz soma
		msg += "Matriz soma: \n";
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma.length; j++) {
				if(matrizSoma[i][j] < 10){
					msg += "0"+matrizSoma[i][j]+"   ";
				}else{
					msg += matrizSoma[i][j]+"   ";
				}
			}
			msg += "\n";
		}
	
	//Mensagem matriz Multiplicação
		msg += "\nMatriz multiplicação: \n";
		for (int i = 0; i < matrizMult.length; i++) {
			for (int j = 0; j < matrizMult.length; j++) {
				if(matrizMult[i][j] < 10){
					msg += "0"+matrizMult[i][j]+"   ";
				}else{
					msg += matrizMult[i][j]+"   ";
				}
			}
			msg += "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}