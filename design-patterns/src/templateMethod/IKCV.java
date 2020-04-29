package templateMethod;

import strategy.Item;
import strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {//para cada valor dentro de cada item 
			if (item.getValor() > 100) 
				return true;
		}
		return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

}
