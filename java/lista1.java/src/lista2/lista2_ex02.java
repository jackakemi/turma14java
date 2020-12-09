/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
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
		
		System.out.println("Digite seu código: ");
		C = leia.next();
		
		System.out.println("Digite total de horas trabalhadas: ");
		N = leia.nextDouble();
		
		salario = N * hora;
		salarioMax = horasMax * hora;
		salarioExcedente = (N - horasMax)*horaExtra;
		
		if (N>horasMax) {
			System.out.println("Salário: R$" + salarioMax + "\nHora extra: R$" + salarioExcedente + "\nSalário Total: R$" + (salarioMax + salarioExcedente));
		}
		else {
			System.out.println("Salário: R$" + salario);
		}
		
		
	}

}
