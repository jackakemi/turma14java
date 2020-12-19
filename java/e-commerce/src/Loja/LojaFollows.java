package Loja;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class LojaFollows {


	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Pessoa cliente = new Pessoa();
		Produto produto = new Produto();

		List<Produto> lista = new ArrayList<Produto>();
		// Collection <String> carrinho = new ArrayList();

		char opcao, genero;
		String nome, codigo;
		int tamanho = 0;
		
		
	
			
		List<Produto> dados = new ArrayList<Produto>();
		dados.add(new Produto("CAMISETA", "FL-001", 55.00, 10));
		dados.add(new Produto("BABY-LOOK", "FL-002", 45.00, 10));
		dados.add(new Produto("REGATA MASCULINA", "FL-003", 40.00, 10));


		// Continuação do código

		// Processamento
		linha(tamanho);
		System.out.println("\nFOLLOW'S");
		System.out.println("O estilo que segue você!");
		linha(tamanho);
		pula();
		System.out.println("[1] - COMPRAR PRODUTO");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		pula();
		System.out.print("DIGITE A OPÇÃO:");
		opcao = leia.next().charAt(0);

		do {
	
			if (opcao == '1') {
				
				
				
				System.out.print("DIGITE SEU NOME: ");
				nome = leia.next().toUpperCase();
				System.out.print("GENERO: [M]MASCULINO, [F]FEMININO E [O]OUTROS: ");
				genero = leia.next().toUpperCase().charAt(0);
				String result = opcaoGenero(genero);
				System.out.println(result + nome + "!!!");
				System.out.println("\n \t \t \t CONFIRA NOSSOS PRODUTOS");
				linha(tamanho);
				System.out.println("\nCódigo\t\tPreço\t\t\tQuantidade\t\tProduto");
				linha(tamanho);

				for (int i = 0; i < dados.size(); i++) {
					
					System.out.printf("\n" + dados.get(i).getCodigoProduto() + "\t\t" + dados.get(i).getNomeProduto()+ "\t\t\t" +dados.get(i).getQtdeProdutoEstoque()+ "\t\t" +
							dados.get(i).getPrecoUnitario());	
				}
				
				System.out.println("Digite o código do produto.");
				codigo = leia.next();

			

			} else if (opcao == '2') {
				System.out.println("WIP");
				pula();
				break;
			}

		} while (opcao != '3');
		{
			System.out.println("AGRADECEMOS SUA VISITA E ESPERAMOS TE VER EM BREVE!");

		}
	}

	public static int linha(int tamanho) {

		tamanho = 80;

		for (int i = 0; i <= tamanho; i++) {
			System.out.print("═");

		}
		return tamanho;
	}

	public static void pula() {
		System.out.println("\n");
	}

	public static String opcaoGenero(char genero) {

		String generoCliente = "";

		if (genero == 'M') {
			pula();
			generoCliente = "Seja bem-vindo a loja FOLLOW'S ";
		} else if (genero == 'F') {
			pula();
			generoCliente = "Seja bem-vinda a loja FOLLOW'S ";

		} else if (genero == 'O') {
			pula();
			generoCliente = "Seja bem-vindx a loja FOLLOW'S ";
		}

		return generoCliente;
	}

}
