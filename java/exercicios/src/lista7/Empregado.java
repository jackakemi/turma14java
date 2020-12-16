package lista7;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	public double salarioBase; //vencimento base
	public double imposto; //porcentagem retida dos impostos
	
	
	public Empregado() {
		
	}
	
	
	
	
	//GET and SET
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	//METODO
	public double calcularSalario() {
		salarioBase = 1000;
		imposto = 0.25;
		
		double desconto = salarioBase*imposto;
		double total = salarioBase-desconto;
		
		return total;
	}
	
	
}

