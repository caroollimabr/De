package strategy;

public class TesteDeImpostos {
	
	//estrat�gia de imposto para calculador
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		//recebe uma estrat�gia qualquer, a executa e utiliza para calcular o imposto
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
}
