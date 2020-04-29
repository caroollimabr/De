package observer;

public class NotaFiscalDao implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("Nota fiscal salva no banco");
	}

}
