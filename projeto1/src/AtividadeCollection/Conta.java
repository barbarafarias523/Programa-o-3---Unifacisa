package AtividadeCollection;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	
	
	public Conta(int agencia, int conta, double saldo, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
	}


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


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + conta;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (conta != other.conta)
			return false;
		return true;
	}
	
	

}
