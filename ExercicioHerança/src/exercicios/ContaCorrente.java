package exercicios;

public class ContaCorrente extends Conta{
	
	@Override
	public void atualiza (double taxa) {
		
		this. saldo += saldo* taxa*2;
	
	}

}