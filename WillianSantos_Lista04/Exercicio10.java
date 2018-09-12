package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		int lim = 2;
		int cod[] = new int[lim];
		String nome[] = new String[lim];
		Double preco[] = new Double[lim];
		int qtd[] = new int[lim];
		int buscaCod;
		String opcao;
		int qtdOpcao;
		String msg = "Produtos\n";
		String msgSaida = "Produtos alterados\n";
		
		for (int i = 0;i < cod.length ; i++) {
			cod[i] = i;
			nome[i] = String.valueOf(JOptionPane.showInputDialog("Informe o nome do produto "+i+": "));
			preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto "+i+": "));
			qtd[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto "+i+": "));
			msg += "Codigo: "+cod[i]+"\n"
					+ "Nome: "+nome[i]+"\n"
					+ "Preco: "+preco[i]+"\n"
					+ "Quantidade: "+qtd[i]+"\n"
							+ "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
		for (int i = 0; ;i++) {
			//Recebimento para buscar cod
			buscaCod = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo  do produto que deseja buscar: (Cod negativo para finalizar) "));
			
			//Verificação para a parada
			if(buscaCod < 0){
				System.out.println("Saindo...");
				break;
			}
			
			//Recebimento da opção
			opcao = String.valueOf(JOptionPane.showInputDialog("Informe a opção (V - Venda / C - Compra): "));
			
			//Verificação da opção
			if(opcao.equalsIgnoreCase("v")){
				opcao = "Venda";
			}else if(opcao.equalsIgnoreCase("c")){
				opcao = "Compra"; 
			}else{
				JOptionPane.showMessageDialog(null,"Digite corretamente!");
			}
			
			//Recebimento da quantide de produtos
			qtdOpcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de "+opcao+" do produto "+buscaCod+": "));
			if(opcao.equalsIgnoreCase("Venda")){
				qtd[buscaCod] -= qtdOpcao; 
			}else{
				qtd[buscaCod] += qtdOpcao; 
			}
			
			//Criação da mensagem de saida
			msgSaida += "Codigo: "+cod[buscaCod]+"\n"
					+ "Nome: "+nome[buscaCod]+"\n"
					+ "Preco: "+preco[buscaCod]+"\n"
					+ "Quantidade: "+qtd[buscaCod]+"\n"
							+ "\n";
			buscaCod=0;
			JOptionPane.showMessageDialog(null, msgSaida);
		}
		//Saida dos dados
		JOptionPane.showMessageDialog(null, msgSaida);
	}
}