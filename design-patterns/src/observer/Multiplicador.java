package observer;

public class Multiplicador implements AcaoAposGerarNota {
	private final double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}

	public void executa(NotaFiscal nf) {
		System.out.println(nf.getValorBruto() * this.fator);
	}
}
