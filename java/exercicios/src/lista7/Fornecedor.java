package lista7;

public class Fornecedor extends Pessoa {
	
	private double valorCredito; //correspondente ao cr�dito m�ximo atribu�do ao fornecedor
	private double valorDivida;  //montante da d�vida para com o fornecedor
	
	
	public Fornecedor() {
		
	}

	//GET and SET
	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//METODO
	public double obterSaldo() {
		valorCredito = 500;
		valorDivida = 200;
		return (this.valorCredito - this.valorDivida);
	
	}

}