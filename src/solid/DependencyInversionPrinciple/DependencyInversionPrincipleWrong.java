package solid.DependencyInversionPrinciple;

public class DependencyInversionPrincipleWrong {
	public class Paypal {
		public void pagar() {
			
		}
	}
	
	public class ControladorDePagamento {
	    private Paypal paypal = new Paypal();

	    public void processarPagamento() {
	        paypal.pagar();
	    }
	}

}
