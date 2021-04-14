package AtividadeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Números {
	
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i <= 200; i++) {
			lista.add(i);
		}
		
		System.out.println(lista);
		
		Collections.reverse(lista);
		
		System.out.println(lista);
	}

}
