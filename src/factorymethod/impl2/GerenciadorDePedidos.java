package factorymethod.impl2;

public abstract class GerenciadorDePedidos {
    public abstract Pedido criarPedido();

    public void receberPedido() {
        Pedido pedido = criarPedido();
        pedido.processar();
    }
}
