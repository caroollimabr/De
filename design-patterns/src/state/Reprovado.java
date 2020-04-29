package state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente orçamento em aprovação ou aprovados recebem desconto extra");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento foi reprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
