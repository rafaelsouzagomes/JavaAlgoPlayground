package factorymethod.impl2.impls.factories;

import factorymethod.impl2.GerenciadorDePedidos;
import factorymethod.impl2.Pedido;
import factorymethod.impl2.impls.PedidoNormal;

public class GerenciadorDePedidosNormais extends GerenciadorDePedidos {
    
	@Override
    public Pedido criarPedido() {
        return new PedidoNormal();
    }
}
