package factorymethod.impl2.impls.factories;

import factorymethod.impl2.GerenciadorDePedidos;
import factorymethod.impl2.Pedido;
import factorymethod.impl2.impls.PedidoExpresso;

public class GerenciadorDePedidosExpressos extends GerenciadorDePedidos {
    @Override
    public Pedido criarPedido() {
        return new PedidoExpresso();
    }
}