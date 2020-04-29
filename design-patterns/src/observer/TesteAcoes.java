package observer;

public class TesteAcoes {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new Impressora());
		
		builder.adicionaAcao(new Multiplicador(2));
		builder.adicionaAcao(new Multiplicador(3));
		builder.adicionaAcao(new Multiplicador(4.5));

		NotaFiscal nf = builder.paraEmpresa("Blabla")
				.comCnpj("12.345.678/0001-9")
				.com(new ItemDaNota("nome", 100.0))
				.comObservacoes("obs")
				.naDataAtual()
				.constroi();
		
		System.out.println(nf.getValorBruto());

	}
}
