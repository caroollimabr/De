package strategy;

//recebe uma estrat�gia qualquer, a executa e utiliza para calcular o imposto
public class CalculadorDeImpostos {
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		double icms = impostoQualquer.calcula(orcamento);
		System.out.println(icms);
		
	}
	
}
