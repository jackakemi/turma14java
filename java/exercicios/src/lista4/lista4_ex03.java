//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição
//das matrizes N1 e N2.

package lista4;

import java.util.Random;

public class lista4_ex03 {
	public static void main(String[] args){
		
		Random sorteio = new Random();
		
		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		
		System.out.println("MATRIZ N1");
		
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				N1[linha][coluna]=sorteio.nextInt(9)+1;
				System.out.println(N1[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println("MATRIZ N2");
		
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				N2[linha][coluna]=sorteio.nextInt(9)+1;
				System.out.println(N2[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println("MATRIZ M1");
		
		for(int linha=0;linha<4; linha++){
			for(int coluna=0; coluna<6; coluna++){				
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
				System.out.print(M1[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println("\nMATRIZ M2");
		
		for(int linha=0;linha<4; linha++){
			for(int coluna=0; coluna<6; coluna++){				
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
				System.out.print(M2[linha][coluna]);
			}
			System.out.println();
		}

}
}