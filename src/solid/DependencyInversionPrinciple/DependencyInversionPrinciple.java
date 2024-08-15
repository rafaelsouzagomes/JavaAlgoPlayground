package solid.DependencyInversionPrinciple;

public class DependencyInversionPrinciple {

	public interface ServicoDePagamento {
	    void pagar();
	}

	public class Paypal implements ServicoDePagamento {
	    @Override
	    public void pagar() {
	        // lógica de pagamento com Paypal
	    }
	}

	public class ControladorDePagamento {
	    private ServicoDePagamento servicoDePagamento;

	    public ControladorDePagamento(ServicoDePagamento servicoDePagamento) {
	        this.servicoDePagamento = servicoDePagamento;
	    }

	    public void processarPagamento() {
	        servicoDePagamento.pagar();
	    }
	}
	/*
	 Com isso, você pode facilmente trocar a implementação de 
	 ServicoDePagamento sem modificar a lógica do controlador.
	 * */

}
