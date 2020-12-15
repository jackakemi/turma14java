package lista6;

public class ex03_ProdutoEletronico {
	
	
	public String nome;
	public int qntEstoque;
	public int preço;


	public ex03_ProdutoEletronico(String nome, int qntEstoque, int preço) {		
		this.nome = nome;
		this.qntEstoque = qntEstoque;
		this.preço = preço;
	}


	//MÉTODO
	public  void compraProduto() {
			
		System.out.printf("\nModelo: %s \nQuantidade em Estoque: %d \nPreço R$%d\n\n",this.nome, this.qntEstoque, this.preço);

	}


}