package chainOfResposibility;
import strategy.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		//chama d1, se falhar, chama d2, se falhar, chama d3
		d1.setProximo(d2); 
		d2.setProximo(d3);
		
		return d1.desconta(orcamento);
	}
}
