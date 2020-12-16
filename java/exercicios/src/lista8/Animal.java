package lista8;

public class Animal {
	
	public String nome;
	public int idade;
	
	
	
	//CONSTRUTOR
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	
	}


	
	
	//GET AND SET
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	//METODO
	
	public void somEmitido() {
		System.out.println();
		
	}
}
