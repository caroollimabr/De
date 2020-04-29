package chainOfResposibility;
import strategy.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		//se o valor pago for maior que $500, recebe desconto de 7%
		if (orcamento.getValor() > 500.0)
			return orcamento.getValor() * 0.07;
		else
			return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
