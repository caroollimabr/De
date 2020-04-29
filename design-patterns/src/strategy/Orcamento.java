package strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private double valor;
	private final List<Item> itens; //final: não vai ser modificado

	//construtor
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
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


	
	

}
