package AtividadeSala;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> ordena = new ArrayList<Integer>();
		
		for(int i = 1; i <= 1000; i++) {
			ordena.add(i);
		}
		
		Collections.reverse(ordena);
		
		System.out.println(ordena);
	}

}
