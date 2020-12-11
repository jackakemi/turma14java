//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
//apresente também quantas foram as ocorrências da maior pontuação.

package lista4;

import java.util.Random;

public class lista4_ex2 {
	public static void main(String[] args){
		
		Random sorteio = new Random(); 
		
		final int total = 10;
		int lancamentos[] = new int[10];
		double media = 0.0;
		int soma = 0;
		
		
		for(int i=0; i<10; i++){
			lancamentos[i]=sorteio.nextInt(6)+1;
			System.out.printf("\nLançamento: %d", lancamentos[i]);
			soma += lancamentos[i];
		
		}
		System.out.printf("\nA soma dos lançamentos é: %d",soma);
		
		media = (media + soma)/total;
		System.out.printf("\nA média é: %.2f",media);	
	}

}
