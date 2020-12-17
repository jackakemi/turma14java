package lista8;

public class testeAnimal {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal cachorro= new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica = new Preguica();
		
		cachorro.setNome("Bidu");
		cachorro.setIdade(2);
		
		
		animal.somEmitido();
		System.out.println("\nVocê é um cachorro que se chama " + animal.getNome() + " e tem " + animal.getIdade() + 
				" anos de idade.");
		cachorro.somEmitido();
		
	}

}
