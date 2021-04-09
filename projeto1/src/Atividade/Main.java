package Atividade;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1, 111, "Cliente 1", 20000);
		cc.sacar(1000);
		
		ContaPoupanca cp = new ContaPoupanca(2, 222, "Cliente 2", 150);
		cp.depositar(30000);
		
		System.out.println(cc);
		System.out.println(cp);

	}

}
