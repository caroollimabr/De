package observer;

import java.util.GregorianCalendar;

import builder.NotaFiscalBuilder;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Bla")
			.comCnpj("12.345.678/0001-12")
			.com(new ItemDaNota("item 1", 200.0))
			.com(new ItemDaNota("item 2", 300.0))
			.com(new ItemDaNota("item 3", 400.0))
			.comObservacoes("observações")
			.naData(new GregorianCalendar())
			.constroi();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
