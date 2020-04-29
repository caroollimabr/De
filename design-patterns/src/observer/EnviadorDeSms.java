package observer;

public class EnviadorDeSms implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf) {
		System.out.println("Enviado por SMS");
		
	}
}
