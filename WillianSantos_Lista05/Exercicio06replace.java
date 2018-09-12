package br.edu.ifcvideira.Lista05;

import javax.swing.JOptionPane;

public class Exercicio06replace {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite a frase: ");
		JOptionPane.showMessageDialog(null, frase.replaceAll("a", "*"));
	}
}