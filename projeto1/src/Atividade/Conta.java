package Atividade;

public abstract class Conta {
	
	private static final int VALOR = 0;
	private int agencia;
	private int conta;
	private String titular;
	private double limite;
	private double saldo;
	private int valorLimite;
	
	
	public Conta(int agencia, int conta, String titular, double limite, double saldo, int valorLimite) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}
	
	
	
	public Conta(int agencia, int conta, String titular, double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}



	public void sacar(int valor) {
		if(saldo > VALOR) {
			this.saldo -= (valor + getImposto());
		}
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public abstract double getImposto();
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(int valorLimite) {
		this.valorLimite = valorLimite;
	}



	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", titular=" + titular + ", limite=" + limite
				+ ", saldo=" + saldo + ", valorLimite=" + valorLimite + "]";
	}
	
	

}
