package templateMethod;

import java.util.ArrayList;
import java.util.List;

import strategy.Item;
import strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		
		for (Item item : orcamento.getItens()) { //para cada item do orçamento, ...
			if(noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}
		return false;

	}

}
