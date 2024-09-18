package factorymethod;

public class DescontoValorFixo implements Calculo {
    private double valorDesconto;

    public DescontoValorFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double aplicar(double valorBase) {
        return valorBase - valorDesconto;
    }
}