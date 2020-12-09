/* A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

package lista2;

import java.util.Scanner;

public class lista2_ex05 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao = 0.0;

		System.out.println("Digite porcentagem do �ndice de polui��o em %: ");
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
			i = "�ndice de polui��o aceit�vel";
		}
		else if(indicePoluicao > indiceMaxAceitavel && indicePoluicao <= indiceMaxG1){
			i = "Suspender atividades das ind�strias do 1� Grupo!";
		}

		else if(indicePoluicao > indiceMaxG1 && indicePoluicao <= indiceMaxG2){
			i = "Suspender atividades das ind�strias do 1� e 2� Grupo!";
		}

		else if(indicePoluicao > indiceMaxG2 && indicePoluicao <= indiceInaceitavel){
			i = "Suspender atividades das ind�strias do 1�, 2� e 3� Grupo!";
		}

		else{
			i = (" ");
		}
		return i;
	}
}

