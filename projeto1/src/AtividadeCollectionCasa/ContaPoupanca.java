package AtividadeCollectionCasa;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public ContaPoupanca(int limite, double saldo, int numero) {
		super(limite, saldo, numero);
	}

	
	public int compareTo(ContaPoupanca conta) {
		if(this.getNumero() < conta.getNumero()) {
			return -1;
		}else if(this.getNumero() > conta.getNumero()) {
			return 1;
		}
		return 0;
	}
	
	

}
