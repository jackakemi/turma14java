/*Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo.*/

package lista2;

import java.util.Scanner;

public class lista2_ex04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num = 0;
		int par, impar, positivo, negativo;
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		System.out.println(numero(num));
				
	}
	
	public static String numero(int num) {
		String valor = "";
		
		if(num%2 == 0 && num>0) {
			valor = num + " � par e positivo";
		}
		else if(num%2 == 0 && num<0){
			valor = num + " � par e negativo";
		}
		else if(num%2 == 1 && num>0){
			valor = num + " � impar e positivo";
		}
		else {
			valor = num + " � impar e negativo";
		}
		
		return valor;
	}
	
	
	
	

}
