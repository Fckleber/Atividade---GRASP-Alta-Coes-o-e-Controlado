package sistema;

public class ItemVenda {
	private int quantidade;
	private Produto produto;
	// O construtor é chamado pelo Creator (Venda)
	public ItemVenda(Produto produto, int quantidade) {
	this.produto = produto;
	this.quantidade = quantidade;
	}
	// Aplicação do Information Expert:
	// A classe ItemVenda calcula o subtotal porque tem a informação (quantidade)
	// e acesso à informação necessária (precoUnitario do Produto).
	public double calcularSubtotal() {
	return produto.getPrecoUnitario() * quantidade;
	}
	}