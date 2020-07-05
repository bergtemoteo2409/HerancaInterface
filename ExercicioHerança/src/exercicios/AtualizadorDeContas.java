package exercicios;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas (double selic) {
		this.selic = selic;
	}
	public void roda(Conta c){
		//imprimir saldo anterior
		System.out.println("Saldo anterior: " + c.getSaldo( ));
		//atualizar a conta com taxa Selic
		c.atualiza(selic);
		//imprimir saldo final
		System.out.println("Saldo final: " + c.getSaldo( ));
		//incrementar saldoTotal
		

		saldoTotal += c.getSaldo( );
	}
	
	public Double getSaldoTotal( ) {
		return saldoTotal;

	}

}
