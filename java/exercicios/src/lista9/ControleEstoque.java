package lista9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ControleEstoque {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		String adicionar, remover, exibir, estoque;
		
		System.out.println("\t\t**Produtos em Estoque**");
		
		Collection <String> produto = new ArrayList();
		produto.add("caneca");
		produto.add("copo");
		produto.add("prato");
		produto.add("panela");
		produto.add("talher");
		
		System.out.println("Lista de Estoque: " + produto);
		
		produto.remove("copo");
		
		System.out.println("Lista de Estoque removido 'copo': " + produto);
		
		for(String listaAtual:produto) {
			System.out.println(listaAtual);
		}
	}
	
}
