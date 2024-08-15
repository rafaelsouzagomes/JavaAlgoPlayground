package solid.InterfaceSegregation;

public class InterfaceSegregationWrong {
	public interface Trabalhador {
	    void trabalhar();
	    void gerenciar();
	    void treinar();
	}

	public class FuncionarioComum implements Trabalhador {
	    @Override
	    public void trabalhar() {
	        // lógica de trabalho
	    }

	    @Override
	    public void gerenciar() {
	        // lógica de gerenciamento (não aplicável)
	    }

	    @Override
	    public void treinar() {
	        // lógica de treinamento (não aplicável)
	    }
	}

}
