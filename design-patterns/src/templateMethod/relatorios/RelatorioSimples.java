package templateMethod.relatorios;

import java.util.List;

import chainOfResposibility.conta.Conta;

public class RelatorioSimples extends Relatorio{

	@Override
	protected void cabecalho() {
		System.out.println("Banco Blabla");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta: contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
		
	}

	@Override
	protected void rodape() {
		System.out.println("(11)1111-1111");
		
	}

}
