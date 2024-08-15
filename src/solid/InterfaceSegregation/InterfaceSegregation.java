package solid.InterfaceSegregation;

public class InterfaceSegregation {
	public interface Trabalhador {
	    void trabalhar();
	}

	public interface Gerente extends Trabalhador {
	    void gerenciar();
	}

	public interface Treinador extends Trabalhador {
	    void treinar();
	}

	public class FuncionarioComum implements Trabalhador {
	    @Override
	    public void trabalhar() {
	        // lógica de trabalho
	    }
	}

}
