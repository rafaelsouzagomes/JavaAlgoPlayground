package solid.singleresponsability;

public class SingleResponsability {

	public class Pedido {
	    public void calcularTotal() {
	        // lógica de cálculo do total do pedido
	    }
	}

	public class PedidoRepository {
	    public void salvarPedido(Pedido pedido) {
	        // lógica de salvar o pedido no banco de dados
	    }
	}
	
	/*
	 Aqui, o cálculo do total e a persistência do pedido estão em classes separadas,
	  cada uma com uma responsabilidade única.
	 * */

}
