package br.edu.ifcvideira.Lista05;

import javax.swing.JOptionPane;

public class Exercicio06 {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Insira a frase:");
		StringBuilder consulta = new StringBuilder();
		
		String palavras[] = frase.split("a");
		
		for (int i = 0; i < palavras.length; i++) {
			consulta.append(palavras[i]);
			consulta.append("*");
		}
		
		JOptionPane.showMessageDialog(null, consulta.toString());
	}

}
