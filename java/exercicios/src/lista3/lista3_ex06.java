//Faça um programa que pegue um número do teclado e calcule a soma de todos os números 
//de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
//usar Do while;

package lista3;

import java.util.Scanner;

public class lista3_ex06 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0, i=0;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		do {
			 i++;
			 soma = soma + i;
		}
		while(i<num);
		
		System.out.println("A soma de todos os númeors de 1 à " + num + " é: " + soma);
	}
}
