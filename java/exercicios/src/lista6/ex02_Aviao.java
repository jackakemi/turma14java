package lista6;

public class ex02_Aviao {
	
	public String modelo;
	public int serie;
	public int capacidade;


	public ex02_Aviao(String modelo, int serie, int capacidade) {		
		this.modelo = modelo;
		this.serie = serie;
		this.capacidade = capacidade;
	}


	//MÉTODO
	public  void especificacoesAviao() {	
		System.out.printf("\nModelo: %s \nSerie: %d \nCapacidade: %d passageiros\n\n",this.modelo, this.serie, this.capacidade);

	}
}
