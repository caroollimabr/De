package state;

public class EmAprovacao implements EstadoDeUmOrcamento{
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(! descontoAplicado) {
			//orcamento.valor = orcamento.valor - orcamento.valor * 0.05
			orcamento.valor -= orcamento.valor * 0.05; //a -= b � o mesmo que a = a - b
		} else {
			throw new RuntimeException ("Desconto j� aplicado");
		}
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos em aprova��o n�o podem ir direto para finalizado");
		
	}

}
