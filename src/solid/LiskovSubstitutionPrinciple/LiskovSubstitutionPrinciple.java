package solid.LiskovSubstitutionPrinciple;

public class LiskovSubstitutionPrinciple {

	public class Funcionario {
	    public double calcularBonus(double salario) {
	        return salario * 0.1;
	    }
	}

	public class Estagiario extends Funcionario {
	    @Override
	    public double calcularBonus(double salario) {
	        return 0;
	    }
	}
	/*
	 A implementação correta garante que o Estagiario pode ser usado como um 
	 Funcionario sem causar problemas no código.
	 * */

}
