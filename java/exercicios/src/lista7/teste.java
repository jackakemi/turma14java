package lista7;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Fornecedor F = new Fornecedor();
		Empregado E = new Empregado();
		Pessoa P = new Pessoa();
		
		System.out.println("Digite nome do funcion�rio: ");
		P.nome = leia.next();
		P.setEndereco("Rua Generation, n�10");
		P.setTelefone("987654321");
		System.out.printf(P.nome + "\nEndere�o: " + P.getEndereco() + "\nTel: " + P.getTelefone());
		System.out.printf("\nC�digo do Funcion�rio: ");
		E.setCodigoSetor(12345);
		System.out.println("\nSal�rio Total: " + E.calcularSalario());
		
		System.out.println("\n\nDados Fornecedor\nValor saldo: " + F.obterSaldo());
		
		
		
	}

}

