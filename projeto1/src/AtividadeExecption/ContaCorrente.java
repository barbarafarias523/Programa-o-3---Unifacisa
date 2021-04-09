package AtividadeExecption;

public class ContaCorrente {
	
	private float limite;
	private float saldo;
	private float valorLimite;
	
	public ContaCorrente(float limite, float saldo, float valorLimite) {
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}
	
	public void sacar(float valor) throws SaldoInsuficienteException, IllegalArgumentException{
		if(saldo >= valor) {
			this.saldo -= valor;
		}else if(saldo < valor){
			throw new SaldoInsuficienteException("Saldo insuficiente");
			 
		}else if(valor < 0) {
			throw new IllegalArgumentException("Valor indisponivel");
		}
	}
	
	public void depositar(float valor) throws IllegalArgumentException{
		if(valor > 0) {
			this.saldo += valor;
		}else {
			throw new IllegalArgumentException("Valor indisponivel para deposito");
		}
	}
	
	public void setValorLimite(float valorLimite) throws SetNegativoException{
		this.valorLimite = valorLimite;
		if(valorLimite < 0) {
			throw new SetNegativoException("Limite indisponivel");
		}
		
	}
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite1(float valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	

}
