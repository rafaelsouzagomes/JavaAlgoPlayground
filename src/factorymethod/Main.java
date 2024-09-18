package factorymethod;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraAcrescimo(10); // 10% de acréscimo
        System.out.println(calculadora.processarCalculo(100)); // Calcula acréscimo sobre 100

        calculadora = new CalculadoraDesconto(15); // Desconto de R$15
        System.out.println(calculadora.processarCalculo(100)); // Aplica desconto sobre 100
    }
}
