package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

/* Professor Pensei em varias formas de fazer esse exercicio e todas ficavam complexas e
 * cheias de gambiarra, resolvi que uma matriz seria mais facil pra resolução.*/

public class Exercicio11 {
	public static void main(String[] args) {
		int lim = 3;
		int meses[][] = new int[12][3];
		int qtd1Semestre[] = new int[lim];
		int qtd2Semestre[] = new int[lim];
		String msg = "";
		
		
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 3; j++) {
				meses[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Mes "+(i+1)+":\nProduto "+(j+1)+": "));
			}
		}
		
		msg += "Produtos primeiro semestre\n";
		for (int i = 0; i < 6; i++) {
			msg += "Mes "+(i+1)+"\n";
			for (int j = 0; j < 3; j++) {
				qtd1Semestre[j] += meses[i][j];
				msg += "Produto "+(j+1)+": "+qtd1Semestre[j]+"\n";
			}
			msg += "\n";
		}	
		
		msg += "Produtos segundo semestre\n";
		for (int i = 6; i < 12; i++) {
			msg += "Mes "+(i+1)+"\n";
			for (int j = 0; j < 3; j++) {
				qtd2Semestre[j] += meses[i][j];
				msg += "Produto "+(j+1)+": \n"+qtd2Semestre[j]+"\n";
			}
			msg += "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
