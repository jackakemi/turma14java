//Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
//(imprimindo o novo valor) até que ele seja maior do que 100.
//Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
//Utilize o while;

package lista3;

import java.util.Scanner;

public class lista3_ex04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		resultado(num);
			
	}
	
	public static void resultado(int num) {
		
		while (num<= 100) {
		num = num *3;
		
		System.out.println(num);
		}
	}

}
