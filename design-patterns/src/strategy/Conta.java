package strategy;

public class Conta {
	public double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	
	
	
}
