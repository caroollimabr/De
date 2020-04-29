package chainOfResposibility;
import strategy.Orcamento;

public class DescontoPorCincoItens implements Desconto {
	private Desconto proximo;

	public double desconta (Orcamento orcamento) {
		//se tiver + de 5 itens, recebe desconto
				if(orcamento.getItens().size() > 5)
					return orcamento.getValor() * 0.1;
				else 
					return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
}
