package factorymethod;

public class CalculadoraDesconto extends Calculadora {
    private double valorDesconto;

    public CalculadoraDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public Calculo criarCalculo() {
        return new DescontoValorFixo(valorDesconto);
    }
}
