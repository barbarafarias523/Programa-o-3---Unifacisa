package AtividadeExecption;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente(1000, 1500, 900);
		try {
			c.sacar(2500);
		} catch (SaldoInsuficienteException e) {
			e.getMessage();
		}catch(IllegalArgumentException e) {
			e.getMessage();
		}
		
		try {
			c.depositar(500);
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
		
		try {
			c.setValorLimite(-15);
		} catch (SetNegativoException e) {
			e.getMessage();
		}
	}

}
