package Atividade;

public final class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int conta, String titular, double limite, double saldo, int valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
	}
	
	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}

	@Override
	public double getImposto() {
		return 1.5;
	}
	
	
}
