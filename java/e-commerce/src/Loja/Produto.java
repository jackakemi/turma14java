package Loja;

import java.util.ArrayList;
import java.util.Collection;

public class Produto {
	
	public String nomeProduto;
	public String codigoProduto;
	public double precoUnitario;
	public int qtdeProdutoEstoque = 10;
	int valorSaidaEstoque;
	int entrada;
	
	//CONSTRUTOR
	public Produto() {
		
	}
	
	
	
	public Produto(String nomeProduto, String codigoProduto, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	
	
	//GET AND SET
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}

	
	
	
	//METODO
	//saída estoque
	public void tiraEstoque (int valorSaidaEstoque) {
		
		if(testarEstoque(valorSaidaEstoque)) {
		this.qtdeProdutoEstoque -= valorSaidaEstoque;
		}
		else {
			System.out.println("ESTOQUE INDISPONIVEL");
		}
	}
		
	
	
	//estrada estoque
	public void adicionaEstoque(int entrada) {
		
		this.qtdeProdutoEstoque += entrada;
		
			
	}
	
	
	public boolean testarEstoque(int valor) 
	{
		
		if (valor > this.qtdeProdutoEstoque) 
		{
			return false;
		}
		else if (valor == 0)
		{
			return false;
		}
		else if (this.qtdeProdutoEstoque == 0)
		{
			return false;
		}
		else if (this.qtdeProdutoEstoque < 0)
		{
			return false;
		}
		else	
		{
			return true;
		}
		
	}
	
	
	public double venda(int qtdeVendida) 
	{
		
		if (testarEstoque(qtdeVendida))
		{
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUnitario;
		
		} 
		else 
		{
			System.out.println("Venda negada!!!");
			return 0;
		}
	
	
	}
		
}
