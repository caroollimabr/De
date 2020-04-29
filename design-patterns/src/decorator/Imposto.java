package decorator;

public abstract class Imposto {
	
	private final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
		this.outroImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	//se houver outros impostos a serem calculados e adicionados ao valor total
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		
		return outroImposto.calcula(orcamento);
	}

}
