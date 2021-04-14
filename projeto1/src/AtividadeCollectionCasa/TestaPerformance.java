package AtividadeCollectionCasa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		//Collection<Integer> teste = new ArrayList<Integer>();
		
		Collection<Integer> teste = new HashSet<Integer>();
		
		int total = 30000;
		
		for(int i = 0; i < 30000; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
			}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
