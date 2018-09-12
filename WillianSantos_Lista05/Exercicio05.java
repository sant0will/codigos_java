package br.edu.ifcvideira.Lista05;

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Insira a frase:");
		StringBuilder consulta = new StringBuilder();
		
		String palavras[] = frase.split(" ");
		
		for (int i = (palavras.length - 1);i >= 0 ; i--) {
			consulta.append(palavras[i]);
			consulta.append(" ");
		}
		
		JOptionPane.showMessageDialog(null, consulta.toString());
	}
}
