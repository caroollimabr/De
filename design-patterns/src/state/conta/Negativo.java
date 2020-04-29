package state.conta;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Saque não efetuado. Conta negativa.");
		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		//conta.saldo = conta.saldo + valor * 0.95
		conta.saldo += valor * 0.95;
		if (conta.saldo > 0) conta.estado = new Positivo();
		
	}

}
