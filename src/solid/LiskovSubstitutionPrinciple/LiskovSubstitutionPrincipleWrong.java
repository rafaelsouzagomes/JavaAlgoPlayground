package solid.LiskovSubstitutionPrinciple;

public class LiskovSubstitutionPrincipleWrong {

	public class Funcionario {
	    public double calcularBonus(double salario) {
	        return salario * 0.1;
	    }
	}

	public class Estagiario extends Funcionario {
	    @Override
	    public double calcularBonus(double salario) {
	        throw new UnsupportedOperationException("Estagiários não recebem bônus");
	    }
	}
	/*
	 Suponha que você tenha uma classe Funcionario e uma classe derivada Estagiario. 
	 e o Estagiario não pode ser tratado como um Funcionario sem problemas,
	  então o LSP foi violado.
	 * */

}
