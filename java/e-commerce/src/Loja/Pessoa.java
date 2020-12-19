package Loja;

public abstract class Pessoa {
	
	private String nome;
	private char genero;
	private int anoNascimento;
	
	
	//CONSTRUTOR
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	
	
	//GET AND SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	
	//METODO
	public int voltaIdade(int anoAtual) {
		
		int idade = anoAtual - anoNascimento;
		
		return idade;
	}
	

}
