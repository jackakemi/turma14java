package lista1.java;
import java.util.Scanner;

//Ex:1 - Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
//expressa apenas em dias.  

public class lista1_ex01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dia, mes, ano, anoResultado, mesResultado, diaResultado, resultadoConversao;
		
		System.out.println("Digite apenas o dia do seu nascimento: ");
		dia = leia.nextInt();
		
		System.out.println("Digite apenas o mês do seu nascimento: ");
		mes = leia.nextInt();
		
		System.out.println("Digite apenas o ano do seu nascimento: ");
		ano = leia.nextInt();
		
		anoResultado = 2020 - ano;
		mesResultado = 12 - mes;
		diaResultado = 7 - dia;
		
		resultadoConversao = anoResultado*365 + mesResultado*30 + diaResultado;
		
		System.out.println("Você já viveu " + resultadoConversao + " dias na Terra!");
}}
