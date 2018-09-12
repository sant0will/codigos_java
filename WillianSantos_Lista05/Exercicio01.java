package br.edu.ifcvideira.Lista05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		int operacao;
		int posicao;
		String consulta;
		
		//Nomes pr� adicionados na array
		alunos.add("Alan");
		alunos.add("Will");
		alunos.add("Jaja");
		
		//for infinito
		for(;;){
			operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o \n"
					+ "1 - Inserir\n"
					+ "2 - Consultar\n"
					+ "3 - Remover\n"
					+ "4 - Listar\n"
					+ "5 - Sair\n"));
			
			//Inserir
			if(operacao == 1){
				operacao = Integer.parseInt(JOptionPane.showInputDialog("Como deseja inserir \n"
						+ "1 - Final\n"
						+ "2 - Posi��o\n"));
				//Inser��o no final da array
				if(operacao == 1){
					alunos.add(String.valueOf(JOptionPane.showInputDialog("Digite o nome do aluno:\n")));
				//Inser��o em posi��o especifica
				}else if(operacao == 2){
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o desejada:\n"));
					alunos.add((posicao - 1), String.valueOf(JOptionPane.showInputDialog("Digite o nome do aluno:\n")));
				}
				
			//Consultar
			}else if(operacao == 2){
				operacao = Integer.parseInt(JOptionPane.showInputDialog("Como deseja inserir \n"
						+ "1 - Nome\n"
						+ "2 - Posi��o\n"));
				//Consulta por nome
				if(operacao == 1){
					consulta = (String.valueOf(JOptionPane.showInputDialog("Digite o nome do aluno a ser consultado:\n")));
					if(alunos.contains(consulta)){
						JOptionPane.showMessageDialog(null, "Nome encontrado!");
					}else{
						JOptionPane.showMessageDialog(null, "Nome n�o encontrado!");
					}
				//Consulta por posi��o	
				}else if(operacao == 2){
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o desejada:\n"));
					JOptionPane.showMessageDialog(null, "O nome "+alunos.get(posicao - 1)+" foi encontrado!\n");
				}
			
			//Remover
			}else if(operacao == 3){
				operacao = Integer.parseInt(JOptionPane.showInputDialog("Como deseja remover \n"
						+ "1 - Nome\n"
						+ "2 - Posi��o\n"));
				//Remover por nome
				if(operacao == 1){
					consulta = (String.valueOf(JOptionPane.showInputDialog("Digite o nome do aluno a ser removido:\n")));
					if(alunos.contains(consulta)){
						alunos.remove(consulta);
						JOptionPane.showMessageDialog(null, "Nome removido com sucesso!");
					}else{
						JOptionPane.showMessageDialog(null, "Nome n�o encontrado!");
					}
				//Remover por posi��o	
				}else if(operacao == 2){
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o desejada:\n"));
					JOptionPane.showMessageDialog(null, "O nome "+alunos.get(posicao - 1)+" foi removido!\n");
					alunos.remove(posicao - 1);
				}
			//Impress�o da array
			}else if(operacao == 4){
				JOptionPane.showMessageDialog(null, alunos+"\n");
			//Sa�da do programa
			}else if(operacao == 5){
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}
			
					
					
					
		}
	}
}
