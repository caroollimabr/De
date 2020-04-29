package strategy;
import java.util.Random;

public class Moderado implements Investimento {

	private Random random;

	public Moderado(Random random) {
		this.random = random;
	}

	@Override
	public double calcula(Conta conta) {
		if(random.nextInt(2) == 0) //50% de chances
			return conta.getSaldo() * 0.025;
		else  //os outros 50%
			return conta.getSaldo() * 0.007;
	}
	
}
