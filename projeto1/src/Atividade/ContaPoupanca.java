package Atividade;

public final class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int conta, String titular, double limite, double saldo, int valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
		
	}
	
	
	public ContaPoupanca(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}


	@Override
	public double getImposto() {
		return 2.8;
	}

}
