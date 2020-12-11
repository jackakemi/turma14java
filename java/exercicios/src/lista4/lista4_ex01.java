//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 

package lista4;

import java.util.Scanner;

public class lista4_ex01 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pontuacao[] = new int [5];
		int y = 0;
		
		for(int i=0; i<5; i++) {
			System.out.printf("Digite o " + (i+1) + "°valor: ");
			pontuacao[i] = leia.nextInt();
			
			if(pontuacao[i]>y) {
				y = pontuacao[i];
			}	
		}
		
		System.out.println("A maior pontuação é: " + y);
	}

}