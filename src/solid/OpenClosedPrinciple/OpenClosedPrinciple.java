package solid.OpenClosedPrinciple;

public class OpenClosedPrinciple {

	public interface Relatorio {
	    void gerarRelatorio();
	}

	public class RelatorioPDF implements Relatorio {
	    public void gerarRelatorio() {
	        // gerar relatório em PDF
	    }
	}

	public class RelatorioCSV implements Relatorio {
	    public void gerarRelatorio() {
	        // gerar relatório em CSV
	    }
	}
	//Aqui, você pode adicionar novas implementações de relatórios sem modificar o código existente.

}
