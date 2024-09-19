package factorymethod.impl2.impls;

import factorymethod.impl2.Pedido;

public class PedidoInternacional implements Pedido {
 
	@Override
    public void processar() {
        System.out.println("Processando pedido internacional.");
    }
}