package lista8;

public class Cavalo extends Animal{
	
	public boolean correr;

	public Cavalo() {
		
	}
	
	
	public Cavalo(String nome, int idade, boolean correr) {
		super(nome, idade);
		this.correr = correr;
	}
	
	

	//METODO
	
	@Override
	
		public void somEmitido() {
			System.out.println("Seu som é a relincha.");
			
		}
	

}
