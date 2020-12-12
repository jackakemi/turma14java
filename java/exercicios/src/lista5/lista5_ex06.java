/* Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3
 * elementos. Em seguida o programa deve fazer a multiplicação do vetor pelas
	colunas da matriz.*/

package lista5;

import java.util.Random;

public class lista5_ex06 {
	public static void main(String[] args){
		
		Random sorteia = new Random();
		
		int vetor[] = new int[3];
		int matriz[][] = new int [3][3];
		int mult;
	
		System.out.println("Vetor");
		for(int i=0; i<3; i++)
		{
			vetor[i]=sorteia.nextInt(9)+1;
			System.out.print(" | "+vetor[i]+" | ");
		}
		
		System.out.println();
		System.out.println("Matriz");
		for(int linha=0;linha<3; linha++){
			for (int coluna=0; coluna<3; coluna++){
				matriz[linha][coluna]= sorteia.nextInt(9)+1;
				System.out.print(" | "+matriz[linha][coluna]+" | ");
			}
			System.out.println();
		}
		
		System.out.println("CALCULO");
		for(int linha=0;linha<3; linha++){
			for(int coluna=0; coluna<3; coluna++){
				mult = vetor[coluna]*matriz[linha][coluna];
				System.out.print(" | "+mult+" | ");				
			}
			System.out.println();
		}
		
	}
}