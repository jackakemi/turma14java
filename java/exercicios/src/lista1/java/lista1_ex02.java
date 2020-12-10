package lista1.java;
import java.util.Scanner;

//Ex:2 - Faça um sistema que leia a idade de uma pessoa expressa em dias e
//mostre-a expressa em anos, meses e dias. 

public class lista1_ex02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int quantDias, dia, mes, ano;
		
		System.out.println("Digite sua idade em dias: ");
		quantDias = leia.nextInt();
		
		ano = (quantDias / 365);
		mes = (quantDias % 365)/30;
		dia = (quantDias % 365)%30;
		
		System.out.println("Você têm " + ano + " anos " + mes + " meses e " + dia + " dias de vida!");
}}