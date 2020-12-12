/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar 
 * uma indica��o sobre a condi��o de peso de uma pessoa adulta. 
 * A f�rmula � IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o 
de acordo com a tabela abaixo. 

IMC em adultos Condi��o 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso
*/

package lista5;

import java.util.Scanner;

public class lista5_ex02 {
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	
	double altura = 0.0, peso = 0.0, imc = 0.0;
	
	System.out.println("Digite seu peso: ");
	peso = leia.nextDouble();
	System.out.println("Digite sua altura: ");
	altura = leia.nextDouble();
	
	imc=peso/(altura*altura);
	
	
		if(imc <= 18.5) {
			System.out.println("\nAbaixo do peso");
		}
		else if(imc > 18.5 && imc <= 25) {
			System.out.println("\nPeso normal");
		}
		else if(imc > 25 && imc <= 30) {
			System.out.println("\nAcima do peso");
		}
		else {
			System.out.println("\nObeso");
		}
}
}

