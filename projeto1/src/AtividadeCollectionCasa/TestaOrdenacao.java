package AtividadeCollectionCasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> conta = new ArrayList<ContaPoupanca>();
		
		ContaPoupanca c1 = new ContaPoupanca(1000, 300, 1);
		conta.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca(5000, 3500, 2);
		conta.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca(500, 100, 3);
		conta.add(c3);
		
		Collections.sort(conta);
		
		for(int i = 0; i < conta.size(); i++) {
			Conta atual = conta.get(i);
			System.out.println("Número da conta: " + atual.getNumero() + " Saldo : " + atual.getSaldo() + " Limite: " + atual.getLimite());
		}
	}

}
