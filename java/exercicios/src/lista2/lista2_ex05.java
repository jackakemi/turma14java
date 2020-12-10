/* A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.*/

package lista2;

import java.util.Scanner;

public class lista2_ex05 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao = 0.0;

		System.out.println("Digite porcentagem do índice de poluição em %: ");
		indicePoluicao = leia.nextDouble();
		System.out.println(indice(indicePoluicao));		
	}


	public static String indice(double indicePoluicao) {
		String i = "";
		final double indiceMinAceitavel = 5;
		final double indiceMaxAceitavel = 25;
		final double indiceMaxG1 = 30;
		final double indiceMaxG2 = 40;
		final double indiceInaceitavel = 50;
		
		if(indicePoluicao >= indiceMinAceitavel && indicePoluicao <= indiceMaxAceitavel){
			i = "Índice de poluiçâo aceitável";
		}
		else if(indicePoluicao > indiceMaxAceitavel && indicePoluicao <= indiceMaxG1){
			i = "Suspender atividades das indústrias do 1° Grupo!";
		}

		else if(indicePoluicao > indiceMaxG1 && indicePoluicao <= indiceMaxG2){
			i = "Suspender atividades das indústrias do 1° e 2° Grupo!";
		}

		else if(indicePoluicao > indiceMaxG2 && indicePoluicao <= indiceInaceitavel){
			i = "Suspender atividades das indústrias do 1°, 2° e 3° Grupo!";
		}

		else{
			i = (" ");
		}
		return i;
	}
}

