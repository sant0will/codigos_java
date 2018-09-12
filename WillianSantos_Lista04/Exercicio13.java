package br.edu.ifcvideira.Lista04;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio13 {
	public static void main(String[] args) {
		int matriz[][] = new int[10][10];
		int maior = 0;
		int maiori = 0;
		int maiorj = 0;
		Random gerador = new Random();
		 
       for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			matriz[i][j] = gerador.nextInt();
		}
       } 
       
       for (int i = 0; i < matriz.length; i++) {
   		for (int j = 0; j < matriz.length; j++) {
   			if(matriz[i][j] > maior){
   				maior = matriz[i][j];
   				maiori = i;
   				maiorj = j;
   			}
   		}
       }
       
   		JOptionPane.showMessageDialog(null, "O maior numero da matriz: "+matriz[maiori][maiorj]+"\n"
   				+ "Posição i: "+maiori+"\n"
   				+ "Posição j: "+maiorj+"\n");
      
	}
}
