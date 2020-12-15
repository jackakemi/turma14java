/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package lista6;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);	
		
		int escolha;
		

		ex03_ProdutoEletronico item1 = new ex03_ProdutoEletronico("Televisão", 20, 4000);
		ex03_ProdutoEletronico item2 = new ex03_ProdutoEletronico("Notebook", 15, 3200);
		ex03_ProdutoEletronico item3 = new ex03_ProdutoEletronico("Celular", 50, 1800);
		ex03_ProdutoEletronico item4 = new ex03_ProdutoEletronico("Tablet", 10, 1000);
		
		do {
			System.out.println("QUAL PRODUTO DESEJA SOLICITAR?\n[1]TV\n[2]Notebook\n[3]Celular\n[4]Tablet\n[0]SAIR");
			escolha = leia.nextInt();
			
			if(escolha == 1) {
				item1.compraProduto();
			} 
			else if(escolha == 2) {
				item2.compraProduto();
			}
			else if(escolha == 3) {
				item3.compraProduto();
			}
			else if(escolha == 4) {
				item4.compraProduto();
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
