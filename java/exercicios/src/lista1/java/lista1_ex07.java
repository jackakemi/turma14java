package lista1.java;

import java.util.Scanner;

public class lista1_ex07 {	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double coefA, coefB, coefC, coefD, coefE, coefF, resultadoX, resultadoY;
		
		System.out.println("Digite o coeficiente A: ");
		coefA = leia.nextDouble();
		
		System.out.println("Digite o coeficiente B: ");
		coefB = leia.nextDouble();
		
		System.out.println("Digite o coeficiente C: ");
		coefC = leia.nextDouble();
		
		System.out.println("Digite o coeficiente D: ");
		coefD = leia.nextDouble();
		
		System.out.println("Digite o coeficiente E: ");
		coefE = leia.nextDouble();
		
		System.out.println("Digite o coeficiente F: ");
		coefF = leia.nextDouble();
		
		resultadoX = ((coefC*coefE) - (coefB*coefF)/(coefA*coefE - coefB*coefD));
		resultadoY = ((coefA*coefF) - (coefC*coefD)/(coefA*coefE - coefB*coefD));
		
		System.out.printf("O valor de X é: %.2f", resultadoX);
		System.out.printf("\n" + "O valor de Y é: %.2f", resultadoY);		
		
}
}