package templateMethod.relatorios;

import java.util.Calendar;
import java.util.List;

import chainOfResposibility.conta.Conta;

public class RelatorioComplexo extends Relatorio{

	@Override
	protected void cabecalho() {
		System.out.println("Banco Blabla");
		System.out.println("Av. Bla, 1234");
		System.out.println("(11) 1111-1111");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - " + conta.getSaldo());
		}
		
	}

	@Override
	protected void rodape() {
		System.out.println("banco@blabla.com.br");
		System.out.println(Calendar.getInstance().getTime());
		
	}

}
