package strategy;
import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;
	
	
	public Arrojado(Random random) {
		this.random = random;
	}


	@Override
	public double calcula(Conta conta) {
		int chute = random.nextInt(10); 
		if(chute >= 0 && chute <=1) //20% de chances
			return conta.getSaldo() * 0.05;
		else if (chute >= 2 && chute <= 4) //30% de chances
			return conta.getSaldo() * 0.03;
		else //50% de chances
			return conta.getSaldo() * 0.006;
	}

}
