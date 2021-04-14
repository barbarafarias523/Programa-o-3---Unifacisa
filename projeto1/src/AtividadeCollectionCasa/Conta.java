package AtividadeCollectionCasa;

public class Conta {
	
	private int limite;
	private double saldo;
	private int numero;
	
	public Conta(int limite, double saldo, int numero) {
		super();
		this.limite = limite;
		this.saldo = saldo;
		this.numero = numero;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		
}
