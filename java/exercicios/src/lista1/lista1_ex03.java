package lista1.java;
import java.util.Scanner;

//Ex:3 - Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa
//em segundos e mostre-o expresso em horas, minutos e segundos. 

public class lista1_ex03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempoSegundos = leia.nextInt();
		
		horas = (tempoSegundos / (60*60));
		minutos = (tempoSegundos % (60*60))/60;
		segundos = (tempoSegundos % (60*60))%60;
		
		System.out.println("O evento com dura��o de " + horas + "h " + minutos + "min e " + segundos + "s" );
		
	}
}
