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

	//PRODUTOS EM ESTOQUE
	/*public Collection <String> listaProdutos () {
	
		Collection <String> produto = new ArrayList();
		produto.add("CAMISETA");
		produto.add("BABY-LOOK");
		produto.add("REGATA MASCULINA");
		produto.add("REGATA FEMININA");
		produto.add("CAMISA POLO");
		produto.add("MOLETOM");
		produto.add("ÓCULOS DE SOL SIMPLES");
		produto.add("ÓCULOS DE SOL PREMIUM");
		produto.add("RELÓGIO MASCULINO");
		produto.add("RELÓGIO FEMININO");
		return produto;
	}
	
	public Collection <String> codigoProdutos () {
		
		Collection <String> produto = new ArrayList();
		produto.add("FL-001");
		produto.add("FL-002");
		produto.add("FL-003");
		produto.add("FL-004");
		produto.add("FL-005");
		produto.add("FL-006");
		produto.add("FL-007");
		produto.add("FL-008");
		produto.add("FL-009");
		produto.add("FL-010");
		return produto;
	}
	
	public Collection <String> valorProdutos () {
			
			Collection <String> produto = new ArrayList();
			produto.add("55.00");
			produto.add("45.00");
			produto.add("40.00");
			produto.add("35.00");
			produto.add("60.00");
			produto.add("80.00");
			produto.add("120.00");
			produto.add("200.00");
			produto.add("100.00");
			produto.add("100.00");
			return produto;
	}*/
	
	
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
