package lista1.java;

import java.util.Scanner;
	//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

public class lista1_ex05 {
		public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite notas: ");
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();
		
		nota1 = nota1*2;
		nota2 = nota2*3;
		nota3 = nota3*5;
		
		media = (nota1 + nota2 + nota3)/10;
		
		System.out.println("A média final é de: " + media);
}
}