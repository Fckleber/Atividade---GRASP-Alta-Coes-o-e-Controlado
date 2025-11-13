package sistema;

public class Main {
	public static void main(String[] args) {
		// Inicialização de dados (simulando um banco de dados)
		Produto cafe = new Produto("Café Expresso", 5.00);
		Produto bolo = new Produto("Fatia de Bolo", 12.50);
		// O ponto de entrada para todas as ações do sistema: o Controller
		ControladorVendas controlador = new ControladorVendas();
        //venda1
		// 1. Ação do Usuário: INICIAR NOVO PEDIDO
		Venda vendaAtual = controlador.iniciarVenda();
		// 2. Ação do Usuário: ADICIONAR ITENS
		controlador.adicionarItem(vendaAtual, cafe, 3); // 3 x 5.00 = 15.00
		controlador.adicionarItem(vendaAtual, bolo, 1); // 1 x 12.50 = 12.50
		// 3. Ação do Usuário: FINALIZAR
		double total = controlador.finalizarVenda(vendaAtual);
		System.out.println("\n*** Resultado da Transação ***");
		System.out.println("O total da venda é: R$ " + total); // Esperado: 27.50
		
		//venda2
		Venda vendaAtual2 = controlador.iniciarVenda();
		// 2. Ação do Usuário: ADICIONAR ITENS
		controlador.adicionarItem(vendaAtual2, cafe, 2); // 2 x 5.00 = 10.00
		controlador.adicionarItem(vendaAtual2, bolo, 1); // 1 x 12.50 = 12.50
		// 3. Ação do Usuário: FINALIZAR
		double total2 = controlador.finalizarVenda(vendaAtual2);
		System.out.println("\n*** Resultado da Transação ***");
		System.out.println("O total da venda 2 é: R$ " + total2); // Esperado: 22.50
		
		//Cenário de erro
		Venda vendaNula = null;
		controlador.adicionarItem(vendaNula, cafe, 5);
	}
}
