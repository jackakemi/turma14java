/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/

package lista2;

import java.util.Scanner;

public class lista2_ex04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num = 0;
		int par, impar, positivo, negativo;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		System.out.println(numero(num));
				
	}
	
	public static String numero(int num) {
		String valor = "";
		
		if(num%2 == 0 && num>0) {
			valor = num + " é par e positivo";
		}
		else if(num%2 == 0 && num<0){
			valor = num + " é par e negativo";
		}
		else if(num%2 == 1 && num>0){
			valor = num + " é impar e positivo";
		}
		else {
			valor = num + " é impar e negativo";
		}
		
		return valor;
	}
	
	
	
	

}
