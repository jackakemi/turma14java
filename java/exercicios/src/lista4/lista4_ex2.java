//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e 
//apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

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
			System.out.printf("\nLan�amento: %d", lancamentos[i]);
			soma += lancamentos[i];
		
		}
		System.out.printf("\nA soma dos lan�amentos �: %d",soma);
		
		media = (media + soma)/total;
		System.out.printf("\nA m�dia �: %.2f",media);	
	}

}
