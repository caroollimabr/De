package state;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> itens; //final: não vai ser modificado
	
	protected EstadoDeUmOrcamento estadoAtual;

	//construtor
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens); //getter que gera uma lista que n vai mudar
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
	

}
