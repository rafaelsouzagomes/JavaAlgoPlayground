package solid.singleresponsability;

public class SingleResponsabilityWrong {

	public class Pedido {
	    public void calcularTotal() {
	        // lógica de cálculo do total do pedido
	    }

	    public void salvarPedido() {
	        // lógica de salvar o pedido no banco de dados
	    }
	}
}


