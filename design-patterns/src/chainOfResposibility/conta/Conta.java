package chainOfResposibility.conta;

import java.util.Calendar;

public class Conta {
	private String titular;
	private String agencia;
	private String numero;
	private double saldo;
	private Calendar dataDeAbertura;
	
	public Conta(String titular, double saldo, String agencia, String numero, Calendar dataDeAbertura) { 
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.dataDeAbertura = dataDeAbertura;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Calendar getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	
}
