package state.conta;

public class Positivo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		//conta.saldo = conta.saldo - valor
		conta.saldo -= valor;
		
		if (conta.saldo < 0) conta.estado = new Negativo();
		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		//conta.saldo = conta.saldo + valor * 0.98
		conta.saldo += valor * 0.98;
		
	}

}
