package factorymethod.impl2.impls;

import factorymethod.impl2.GerenciadorDePedidos;
import factorymethod.impl2.impls.factories.GerenciadorDePedidosExpressos;
import factorymethod.impl2.impls.factories.GerenciadorDePedidosInternacionais;
import factorymethod.impl2.impls.factories.GerenciadorDePedidosNormais;

public class Main {
	
    public static void main(String[] args) {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidosNormais();
        gerenciador.receberPedido(); // Processa um pedido normal

        gerenciador = new GerenciadorDePedidosExpressos();
        gerenciador.receberPedido(); // Processa um pedido expresso

        gerenciador = new GerenciadorDePedidosInternacionais();
        gerenciador.receberPedido(); // Processa um pedido internacional
    }
}
