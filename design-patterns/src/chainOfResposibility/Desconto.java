package chainOfResposibility;
import strategy.Orcamento;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo); //m�todo que recebe o pr�ximo desconto
}
