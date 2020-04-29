package templateMethod;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) { //final evita que o método seja modificado/sobrescrito pelas classes filhas
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}
	
	//protected é o ideal porque as classes Cliente não os enxergariam e as classes filhas do Template conseguiriam sobrescrever normalmente

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
