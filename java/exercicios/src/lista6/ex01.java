/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package lista6;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);	
		ex01_Cliente cliente = new ex01_Cliente();
		
		
		System.out.println("Digite seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Digite seu sobrenome: ");
		cliente.sobrenome = leia.next().toUpperCase();
		System.out.println("Digite seu cpf: ");
		cliente.cpf = leia.nextInt();
		System.out.println("Digite idade: ");
		cliente.idade = leia.nextInt();
		cliente.cadastroCliente();		
	}

}