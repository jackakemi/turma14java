//Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos
//de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
//Utilize o FOR;

package lista3;

import java.util.Scanner;

public class lista3_ex02 {
	public static void main(String[] args) {

		int soma = 0;

		numImparMult3();

	}

	public static void numImparMult3() {
		int valor = 0;
		int soma =0;

		for (int i = 1; i <= 500; i++) {
			if ((i % 2 == 1) && (i % 3 == 0)) {
			   valor = i;
			   soma = soma + i; 
			  System.out.println(valor);

			}
		}
		  System.out.println("A soma � " + soma);
	}
}
