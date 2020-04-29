package observer;

public class EnviadorDeEmail implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf) {
		System.out.println("Enviado por e-mail");
	}

}
