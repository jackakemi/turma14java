package lista8;

public class Cachorro extends Animal {
	
	public boolean correr;
	
	
	public Cachorro() {
		
	}
	
	
	public Cachorro(String nome, int idade, boolean correr) {
		super(nome, idade);
		this.correr = correr;
	}
	
	
	
	//METODO
	
	@Override
	
		public void somEmitido() {
			System.out.printf("Seu som é o latido.");
			
		}
}
