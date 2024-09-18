package factorymethod;

public class AcrescimoPorcentagem implements Calculo {
	
    private double porcentagem;

    public AcrescimoPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public double aplicar(double valorBase) {
        return valorBase + (valorBase * porcentagem / 100);
    }
}