package br.edu.ifcvideira.Lista03;

import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		double massaInicial;
		double cont = 0;
		String msg = "";
		massaInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira a "
				+ "massa inicial do material: "));
		
		double massaFinal = massaInicial;
		
		while(massaInicial >= 0.5) {
			massaInicial /= 2;
			cont++;
		}
		
		msg += "Massa Inicial: "+massaFinal+"\n";
		msg += "Massa Final: "+massaInicial+"\n";
		msg += "Tempo(segundos): "+(cont * 50)+"s\n";
		msg += "Tempo(minutos): "+(cont * 50)/60+"min\n";
		msg += "Tempo(horas): "+(cont * 50)/3600+"h\n";
		System.out.println(cont);
		JOptionPane.showMessageDialog(null,msg);
	}

}
