package AtividadeSala;

import java.util.Random;
import java.util.TreeSet;

public class Collections {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> lista = new TreeSet<Integer>();
		
		for(int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		
		System.out.println(lista.descendingSet());
	}

}
