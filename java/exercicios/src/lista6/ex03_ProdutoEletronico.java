package lista6;

public class ex03_ProdutoEletronico {
	
	
	public String nome;
	public int qntEstoque;
	public int pre�o;


	public ex03_ProdutoEletronico(String nome, int qntEstoque, int pre�o) {		
		this.nome = nome;
		this.qntEstoque = qntEstoque;
		this.pre�o = pre�o;
	}


	//M�TODO
	public  void compraProduto() {
			
		System.out.printf("\nModelo: %s \nQuantidade em Estoque: %d \nPre�o R$%d\n\n",this.nome, this.qntEstoque, this.pre�o);

	}


}