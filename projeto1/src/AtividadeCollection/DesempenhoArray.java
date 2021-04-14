package AtividadeCollection;

import java.util.ArrayList;

public class DesempenhoArray {

	public static void main(String[] args) {
		
		long começo = System.currentTimeMillis();
		
		ArrayList<String> comparando = new ArrayList<String>();
		
		System.out.println("Adicionando pessoas na lista: ");
		
		comparando.add("Ana");
		comparando.add("Luiz");
		comparando.add("José");
		comparando.add("João");
		comparando.add("Maria");
		
		for (String i : comparando) {
		}
		
		System.out.println(comparando + "\n");
		
		System.out.println("Removendo pessoas da lista: ");
		
		comparando.remove("João");
		comparando.remove("Maria");
		
		System.out.println(comparando + "\n");
		
		System.out.println("Analisando se tem um determinado item na lista: ");
		
		System.out.println(comparando.contains("Ana"));
		System.out.println(comparando.contains("João"));
		
		long fim =  System.currentTimeMillis();
		long tempo = fim - começo;
		
		System.out.println(tempo);
		
	}
}
