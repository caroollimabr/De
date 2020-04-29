package chainOfResposibility;
import strategy.Orcamento;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo); //método que recebe o próximo desconto
}
