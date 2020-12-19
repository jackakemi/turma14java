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
		String nome, codigo = " ";
		int tamanho = 0;

		List<Produto> dados = new ArrayList<Produto>();
		dados.add(new Produto("CAMISETA", "FL-001", 55.00, 10));
		dados.add(new Produto("BABY-LOOK", "FL-002", 45.00, 10));
		dados.add(new Produto("REGATA MASCULINA", "FL-003", 40.00, 10));
		dados.add(new Produto("REGATA FEMININA", "FL-004", 35.00, 10));
		dados.add(new Produto("CAMISA POLO", "FL-005", 60.00, 10));
		dados.add(new Produto("MOLETOM", "FL-006", 80.00, 10));
		dados.add(new Produto("ÓCULOS DE SOL SIMPLES", "FL-007", 120.00, 10));
		dados.add(new Produto("ÓCULOS DE SOL PREMIUM", "FL-008", 200.00, 10));
		dados.add(new Produto("RELÓGIO MASCULINO", "FL-009", 100.00, 10));
		dados.add(new Produto("RELÓGIO FEMININO", "FL-010", 100.00, 10));
		
		List<Carrinho> carrinho = new ArrayList<Carrinho>();
		
			

		// Continuação do código

		// Processamento
		linha(tamanho);
		System.out.println("\n\t\t\t\t   FOLLOW'S");
		System.out.println("\t\t\t   O estilo que segue você!");
		linha(tamanho);
		pula();
		System.out.println("\t\t\t  [1] - COMPRAR PRODUTO");
		System.out.println("\t\t\t  [2] - GERENCIAR ESTOQUE");
		System.out.println("\t\t\t  [3] - SAIR");
		pula();
		System.out.print("DIGITE A OPÇÃO:");
		opcao = leia.next().charAt(0);

		do {

			if (opcao == '1') {
				//COLOCAR ESSA PARTE PARA FORA DO LOOP PARA QUE NÃO SE REPITA
				System.out.print("DIGITE SEU NOME PARA REALIZAR CADASTRO: ");
				nome = leia.next().toUpperCase();
				System.out.print("GENERO: [M]MASCULINO, [F]FEMININO E [O]OUTROS: ");
				genero = leia.next().toUpperCase().charAt(0);
				String result = opcaoGenero(genero);
				System.out.println(result + nome + "!!!");
				System.out.println("\n \t \t \t CONFIRA NOSSOS PRODUTOS");
				linha(tamanho);
				System.out.println("\nCódigo\t\tQuantidade\t\tPreço\t\t\tProduto");
				linha(tamanho);

				for (int i = 0; i < dados.size(); i++) {

					System.out.printf(
							"\n" + dados.get(i).getCodigoProduto() + "\t\t" + dados.get(i).getQtdeProdutoEstoque() + 
							 "\t\t\t" + dados.get(i).getPrecoUnitario() +  "\t\t\t" + dados.get(i).getNomeProduto());

				}
				System.out.println("\n\nDigite o código do produto para adicionar ao SEU CARRINHO.");
				codigo = leia.next();
				
				for (int i = 0; i < dados.size(); i++) {
					if (dados.get(i).getCodigoProduto().equals(codigo)) {

						carrinho.add(new Carrinho(dados.get(i).nomeProduto));
						System.out.println("\nO item " + dados.get(i).nomeProduto + " foi adicionado ao carrinho! ");
		
					}
					//CONTINUAR A PARTIR DESTE PONTO
					
					// Gostaria de adicionar um novo item? se resposta sim, volta para o loop(carrinho add - do while)
					// se a resposta for não, exibi items do carrinho e pergunta se o usuario deseja remover algum item. se a resposta for sim (criar função de remover)
					// se for não, finalizar a compra e mostrar valor TOTAL. 
	

				}

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
			generoCliente = "\t\tSeja bem-vindo a loja FOLLOW'S ";
		} else if (genero == 'F') {
			pula();
			generoCliente = "\t\tSeja bem-vinda a loja FOLLOW'S ";

		} else if (genero == 'O') {
			pula();
			generoCliente = "\t\tSeja bem-vindx a loja FOLLOW'S ";
		}

		return generoCliente;
	}

}
