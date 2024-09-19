package factorymethod.impl2.impls;

import factorymethod.impl2.Pedido;

public class PedidoExpresso implements Pedido {
   
	@Override
    public void processar() {
        System.out.println("Processando pedido expresso.");
    }
}
