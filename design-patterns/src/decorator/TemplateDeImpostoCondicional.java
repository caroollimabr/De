package decorator;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional() {
		
	}
	
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	

	@Override
	public final double calcula(Orcamento orcamento) { //final evita que o método seja modificado/sobrescrito pelas classes filhas
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}
	
	//protected é o ideal porque as classes Cliente não os enxergariam e as classes filhas do Template conseguiriam sobrescrever normalmente

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
