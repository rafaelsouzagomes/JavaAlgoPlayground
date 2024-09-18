package factorymethod;

public abstract class Calculadora {
    public abstract Calculo criarCalculo();

    public double processarCalculo(double valorBase) {
        Calculo calculo = criarCalculo();
        return calculo.aplicar(valorBase);
    }
}

