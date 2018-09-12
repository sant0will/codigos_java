package br.edu.ifcvideira.Lista04;

import javax.swing.JOptionPane;

public class Exercicio06 {
	public static void main(String[] args) {
		
		int vetor01[] = new int [2];
		int vetor02[] = new int [2];
		int vetor03[] = new int [2];
		int i = 1;
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		String msg = "";
		
		vetor01[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro caracter: ")); 
		vetor02[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo caracter: "));
		vetor03[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro caracter: "));
		num = vetor01[i];
		num1 = vetor02[i];
		num2 = vetor03[i];
		
		if(vetor01[i] == 1){
			if(vetor02[i] == 0 && vetor03[i] == 0){
				msg += "Cem";
			}else{
				msg += "Cento ";
			}
		}else if(vetor01[i] == 2){
			msg += "Duzentos ";
		}else if(vetor01[i] == 3){
			msg += "Trezentos ";
		}else if(vetor01[i] == 4){
			msg += "Quatrocentos ";
		}else if(vetor01[i] == 5){
			msg += "Quinhentos ";
		}else if(vetor01[i] == 6){
			msg += "Seicentos ";
		}else if(vetor01[i] == 7){
			msg += "Setecentos ";
		}else if(vetor01[i] == 8){
			msg += "Oitocentos ";
		}else if(vetor01[i] == 9){
			msg += "Novecentos ";
		}
		
		//Segunda verificação
		if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 1){
			msg += "e onze";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 2){
			msg += "e doze";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 3){
			msg += "e treze";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 4){
			msg += "e catorze";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 5){
			msg += "e quinze";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 6){
			msg += "e dezesseis";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 7){
			msg += "e dezessete";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 8){
			msg += "e dezoito";
		}else if(vetor01[i] != 0 && vetor02[i] == 1 && vetor03[i] == 9){
			msg += "e dezenove";
		}
		
		//Terceira verificação
				
		if(vetor02[i] == 2 && vetor03[i] != 0){
			msg += "e vinte ";
		}else if(vetor02[i] == 3 && vetor03[i] != 0){
			msg += "e trinta ";
		}else if(vetor02[i] == 4 && vetor03[i] != 0){
			msg += "e quarenta ";
		}else if(vetor02[i] == 5 && vetor03[i] != 0){
			msg += "e cinquenta ";
		}else if(vetor02[i] == 6 && vetor03[i] != 0){
			msg += "e sessenta ";
		}else if(vetor02[i] == 7 && vetor03[i] != 0){
			msg += "e setenta ";
		}else if(vetor02[i] == 8 && vetor03[i] != 0){
			msg += "e oitenta ";
		}else if(vetor02[i] == 9 && vetor03[i] != 0){
			msg += "e noventa ";
		}
		
		//Quarta
		if(vetor03[i] == 1 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e um";
		}else if(vetor03[i] == 2 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e dois";
		}else if(vetor03[i] == 3 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e três";
		}else if(vetor03[i] == 4 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e quatro";
		}else if(vetor03[i] == 5 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e cinco";
		}else if(vetor03[i] == 6 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e seis";
		}else if(vetor03[i] == 7 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e sete";
		}else if(vetor03[i] == 8 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e oito";
		}else if(vetor03[i] == 9 && vetor02[i] != 1 && vetor01[i] != 0){
			msg += "e nove";
		}
		
		//Quinta
				
		if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 1){
			msg += "Um";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 2){
			msg += "Dois";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 3){
			msg += "Três";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 4){
			msg += "Quatro";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 5){
			msg += "Cinco";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 6){
			msg += "Seis";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 7){
			msg += "Sete";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 8){
			msg += "Oito";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 9){
			msg += "Nove";
		}else if(vetor01[i] == 0 && vetor02[i] == 0 && vetor03[1] == 0){
			msg += "Zero";
		}
			
		//Sexta
		if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 0){
			msg += "Dez";
		}else if(vetor01[i] == 0 && vetor02[i] == 2 && vetor03[i] == 0){
			msg += "Vinte";
		}else if(vetor01[i] == 0 && vetor02[i] == 3 && vetor03[i] == 0){
			msg += "Trinta";
		}else if(vetor01[i] == 0 && vetor02[i] == 4 && vetor03[i] == 0){
			msg += "Quarenta";
		}else if(vetor01[i] == 0 && vetor02[i] == 5 && vetor03[i] == 0){
			msg += "Cinquenta";
		}else if(vetor01[i] == 0 && vetor02[i] == 6 && vetor03[i] == 0){
			msg += "Sessenta";
		}else if(vetor01[i] == 0 && vetor02[i] == 7 && vetor03[i] == 0){
			msg += "Setenta";
		}else if(vetor01[i] == 0 && vetor02[i] == 8 && vetor03[i] == 0){
			msg += "Oitenta";
		}else if(vetor01[i] == 0 && vetor02[i] == 9 && vetor03[i] == 0){
			msg += "Noventa";
		}
		
		//Setima
		if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 1){
			msg += "Onze";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 2){
			msg += "Doze";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 3){
			msg += "Treze";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 4){
			msg += "Catorze";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 5){
			msg += "Quinze";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 6){
			msg += "Dezesseis";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 7){
			msg += "Dezessete";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 8){
			msg += "Dezoito";
		}else if(vetor01[i] == 0 && vetor02[i] == 1 && vetor03[i] == 9){
			msg += "Dezenove";
		}
		JOptionPane.showMessageDialog(null,num+""+num1+""+num2+" -> "+msg);
			
	
	}
}
