/*Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.*/

package lista2;

import java.util.Scanner;

public class lista2_ex03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		double quadrado = 0.0;
		
		System.out.println("Digite 1� n�mero : ");
		num1 = leia.nextInt();
		System.out.println("Digite 2� n�mero : ");
		num2 = leia.nextInt();
		System.out.println("Digite 3� n�mero : ");
		num3 = leia.nextInt();
		System.out.println("Digite 4� n�mero : ");
		num4 = leia.nextInt();
		
		num1 = num1 * num1;
		num2 = num2 * num2;
		num3 = num3 * num3;
		num4 = num4 * num4;
		
		if(num3 >= 1000) {
			System.out.println("Quadrado do 3� n�mero �: " + num3);
		}
		else {
			System.out.println("Quadrado do 1� n�mero �: " + num1 + "\nQuadrado do 2� n�mero �: " + num2 + "\nQuadrado do 3� n�mero �: " + num3 + "\nQuadrado do 1� n�mero �: " + num4);
		}
		
	}

}

