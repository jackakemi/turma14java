/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package lista6;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);	
		
		int escolha;
		

		ex02_Aviao aviao1 = new ex02_Aviao("Airbus", 320, 240);
		ex02_Aviao aviao2 = new ex02_Aviao("E-Jets", 114, 144);
		ex02_Aviao aviao3 = new ex02_Aviao("Boeing", 737, 230);
		ex02_Aviao aviao4 = new ex02_Aviao("Bombardier", 277, 104);
	
		
		do {
			System.out.println("SOBRE QUAL MODELO DESEJA MAIORES INFORMAÇÕES?\n[1]Airbus\n[2]E-Jets\n[3]Boeing\n[4]Bombardier\n[0]SAIR");
			escolha = leia.nextInt();
			
			if(escolha == 1) {
				aviao1.especificacoesAviao();
			} 
			else if(escolha == 2) {
				aviao2.especificacoesAviao();
			}
			else if(escolha == 3) {
				aviao3.especificacoesAviao();
			}
			else if(escolha == 4) {
				aviao4.especificacoesAviao();
			}
			else if(escolha == 0) {
				System.out.println("Programa Finalizado!");;
			}
			else {
			System.out.println("Opção não identificada, escolha novamente.\n");	   
			}
			}	
			while(escolha != 0);
			
	}

}
