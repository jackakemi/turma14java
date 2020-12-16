package lista7;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Fornecedor F = new Fornecedor();
		Empregado E = new Empregado();
		Pessoa P = new Pessoa();
		
		System.out.println("Digite nome do funcionário: ");
		P.nome = leia.next();
		P.setEndereco("Rua Generation, n°10");
		P.setTelefone("987654321");
		System.out.printf(P.nome + "\nEndereço: " + P.getEndereco() + "\nTel: " + P.getTelefone());
		System.out.printf("\nCódigo do Funcionário: ");
		E.setCodigoSetor(12345);
		System.out.println("\nSalário Total: " + E.calcularSalario());
		
		System.out.println("\n\nDados Fornecedor\nValor saldo: " + F.obterSaldo());
		
		
		
	}

}

