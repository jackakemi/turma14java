package lista8;

public class Preguica extends Animal {
	
	public boolean subirArvore;

	public Preguica(String nome, int idade, boolean subirArvore) {
		super(nome, idade);
		this.subirArvore = subirArvore;
	}
	
	//METODO
	
		@Override
		
			public void somEmitido() {
				System.out.println("Grinhodo");
				
			}

}
