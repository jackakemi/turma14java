package lista1.java;
	//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e 
	//calcule a seguinte expressão: D = R+S/2 , onde R =(A+B)ao quadrado e S = (B+C)ao quadrado

import java.util.Scanner;

public class lista1_ex04 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, resultadoR, resultadoS;
		
		System.out.println("Digite valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite valor de C: ");
		c = leia.nextInt();
		
		resultadoR = Math.pow((a+b), 2);
		resultadoS = Math.pow((b+c), 2);
		
		d = (resultadoR + resultadoS)/2;
		
		System.out.println(d);
		
		
	}
}
