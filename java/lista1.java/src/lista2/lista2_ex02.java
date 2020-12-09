/*Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.*/

package lista2;

import java.util.Scanner;

public class lista2_ex02 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String C;
		double N, salario, salarioExcedente, salarioMax;
		final double hora = 10.0, horaExtra = 20.0;
		final int horasMax = 50;
		
		System.out.println("Digite seu c�digo: ");
		C = leia.next();
		
		System.out.println("Digite total de horas trabalhadas: ");
		N = leia.nextDouble();
		
		salario = N * hora;
		salarioMax = horasMax * hora;
		salarioExcedente = (N - horasMax)*horaExtra;
		
		if (N>horasMax) {
			System.out.println("Sal�rio: R$" + salarioMax + "\nHora extra: R$" + salarioExcedente + "\nSal�rio Total: R$" + (salarioMax + salarioExcedente));
		}
		else {
			System.out.println("Sal�rio: R$" + salario);
		}
		
		
	}

}
