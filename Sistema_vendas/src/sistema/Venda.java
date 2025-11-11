package sistema;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private List<ItemVenda> itens = new ArrayList<>();

	// Responsabilidade de negócio (Alta Coesão)
	public double calcularTotal() {
		// ... (cálculo usando ItemVenda.calcularSubtotal())
		double total = 0.0;
		for (ItemVenda item : itens) {
			total += item.calcularSubtotal();
		}
		return total;
	}

	// Método Creator (que já vimos)
	public ItemVenda criarItemVenda(Produto produto, int quantidade) {
		ItemVenda novoItem = new ItemVenda(produto, quantidade);
		itens.add(novoItem);
		return novoItem;
	}
}
// ItemVenda e Produto também mantêm Alta Coesão por serem focadas
