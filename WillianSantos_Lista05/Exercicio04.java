package br.edu.ifcvideira.Lista05;

import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[] args) {
		int j = 0;
		int i = 0;
		int cont = 0;
		
		String palavra = JOptionPane.showInputDialog("Digite a palavra: ");
	
		j = palavra.length()-1;
		
		for(i = 0; i < palavra.length(); i++, j--){
			if(palavra.charAt(j) != palavra.charAt(i)){
				cont++;
			}
		}
			
		if(cont != 0){
			JOptionPane.showMessageDialog(null, "Não é palindromo");
		}else{
			JOptionPane.showMessageDialog(null, "Palindromo");
		}
		
	}
}