package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio09 {
	public static void main(String[] args) {
		int cod[] = new int[35];
		int salario[] = new int[35];
		String msg = "";
		
		for (int i = 0; i < salario.length; i++) {
			cod[i] = i;
			salario[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o salário do codigo "+i+":"));
		}		
		
		for (int i = 0; i < salario.length; i++) {
			if(salario[i] > 880){
				msg += "Cód "+i+" = "+salario[i]+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}