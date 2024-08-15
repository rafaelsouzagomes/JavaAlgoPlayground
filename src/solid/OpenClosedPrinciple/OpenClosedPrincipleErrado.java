package solid.OpenClosedPrinciple;

public class OpenClosedPrincipleErrado {

	public class Relatorio {
	    public void gerarRelatorio(String tipo) {
	        if (tipo.equals("PDF")) {
	            // gerar relatório em PDF
	        } else if (tipo.equals("CSV")) {
	            // gerar relatório em CSV
	        }
	    }
	}

}
