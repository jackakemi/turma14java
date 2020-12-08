package lista1.java;

import java.util.Scanner;

	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
	//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do
	//distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
	//fábrica de um carro e escreva o custo ao consumidor. 

public class lista1_ex08 {	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, totalDistribuidor, totalImposto, resultado;
		
		System.out.println("Valor de fábrica: ");
		custoFabrica = leia.nextDouble();
		
		totalDistribuidor = (custoFabrica * 0.28);
		totalImposto = (custoFabrica * 0.45);
		
		resultado = (custoFabrica + totalDistribuidor + totalImposto);
		
		System.out.println("O custo final do veículo é de: " + resultado);
			
}
}