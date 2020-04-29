package state;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (! descontoAplicado) {
			//orcamento.valor = orcamento.valor - orcamento.valor * 0.02
			orcamento.valor -= orcamento.valor * 0.02; //a -= b é o mesmo que a = a - b
		} else {
			throw new RuntimeException ("Desconto já aplicado");
		}
		
		
	}

	@Override
	public void aprova(Orcamento orcamento) { //se eu já estou aprovado, não posso ser aprovado novamente
		throw new RuntimeException ("Orçamento já aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException ("Orçamento foi aprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
