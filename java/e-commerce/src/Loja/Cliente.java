package Loja;

public class Cliente extends Pessoa {
	
	private String cpf;

	
	//CONSTRUTOR
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}

	
	
	//GET AND SET
	public String getCpf() {
		return cpf;
	}
	
	
	
	//METODO -  + corrigeCPF(String novoCPF) cpf não pode ser 0 //recebe um novo valor validado para o cpf do cliente;
	public void corrigeCPF (String CPF) {
		
		this.cpf = CPF;
	}

	
	
}
