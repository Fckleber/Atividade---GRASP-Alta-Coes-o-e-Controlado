package sistema;

public class ControladorVendas {
	public Venda iniciarVenda() {
		System.out.println("[Controlador] Iniciando uma nova transação de Venda.");
		// A responsabilidade de 'new Venda()' é do Controller ou de um Creator
		// especializado, dependendo da complexidade. Aqui, o Controller a cria.
		return new Venda();
	}

	// 2. Recebe a ação de "adicionar item"
	public void adicionarItem(Venda venda, Produto produto, int quantidade) {
	 if (venda == null) {
	 System.err.println("[Controlador] Erro: Venda não iniciada.");
	 return;
	 }
	 System.out.println("[Controlador] Adicionando item: " + produto.getNome() + " x"
	+ quantidade);

	 // DELEGA a responsabilidade de criação e agregação para o objeto de domínio venda
	 venda.criarItemVenda(produto, quantidade);
	 }

	// 3. Recebe a ação de "finalizar" e retorna um resultado
	public double finalizarVenda(Venda venda) {
	 System.out.println("[Controlador] Finalizando venda e calculando total.");

	 // DELEGA a responsabilidade de cálculo (Expert) para o objeto de domínio venda

	 double total = venda.calcularTotal();

	 // Em um sistema real, o Controller faria mais aqui (salvar no DB, etc.).
	 System.out.println("[Controlador] Total obtido do objeto Venda.");
	 return total;
	 }
}
