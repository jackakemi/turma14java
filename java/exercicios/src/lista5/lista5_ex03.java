/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos 
 *deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
 *A entrada de dados deve terminar quando for lido um número negativo.
 *contar os numeros entre os intervalos
	-menor que 0 ele para
	- maior que 100 ele nao  conta
 */

package lista5;

import java.util.Scanner;

public class lista5_ex03 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		
		
		
		do {
			System.out.println("Digite um número de 0 a 100: ");
			num = leia.nextInt();
			
			if(num >= 0 && num <= 25) {
				contador1++;
			}
			
			else if(num > 25 && num <= 50){
				contador2++;
				}

			else if(num > 50 && num <= 75){
				contador3++;
				}

			else if(num > 75 && num <= 100){
				contador4++;
				}	
			}
		
			while(num > 0);
		
		System.out.println("entre 0 - 25: " + contador1 + "\n");
		System.out.println("entre 26 - 50: " + contador2 + "\n");
		System.out.println("entre 51 - 75: " + contador3 + "\n");
		System.out.println("entre 76 - 100: " + contador4 + "\n");
		System.out.printf("\nTotal de vezes digitadas = " + 
		(contador1 + contador2 + contador3 + contador4), "\n\n");
			
}
}



			
