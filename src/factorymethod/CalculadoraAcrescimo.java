package factorymethod;

public class CalculadoraAcrescimo extends Calculadora {
    private double porcentagem;

    public CalculadoraAcrescimo(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public Calculo criarCalculo() {
        return new AcrescimoPorcentagem(porcentagem);
    }
}