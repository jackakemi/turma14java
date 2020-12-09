/*Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar uma multa de
R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
(peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
com o conte�do ZERO.*/

package lista2;

import java.util.Scanner;

public class lista2_ex01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double P, E = 0;
		final int M = 4;
		int pesoPermitido = 50;
		
		System.out.println("Insira peso da carga em Kg: ");
		P = leia.nextDouble();
		
		if (P>pesoPermitido) {
			E = P-pesoPermitido;
			System.out.println("Peso em excesso. Valor a pagar: R$" + E * M);
		}
		else {
			System.out.println("Peso dentro do limite permitido");
		}
		
		
		
		
		
		
		
		

}
}