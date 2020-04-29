package templateMethod.relatorios;

import java.util.List;

import chainOfResposibility.conta.Conta;

abstract class Relatorio {
	protected abstract void cabecalho();
	protected abstract void corpo(List<Conta> contas);
	protected abstract void rodape();
	
	public void imprime(List<Conta> contas) {
		cabecalho();
		rodape();
		corpo(contas);
	}
}
