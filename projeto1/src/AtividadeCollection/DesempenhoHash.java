package AtividadeCollection;

import java.util.HashSet;

public class DesempenhoHash {

	public static void main(String[] args) {
		
		long come�o = System.currentTimeMillis();
		
		HashSet <String> comparando = new HashSet<String>();
		
		System.out.println("Adicionando pessoas na lista: ");
		
		comparando.add("Ana");
		comparando.add("Luiz");
		comparando.add("Jos�");
		comparando.add("Jo�o");
		comparando.add("Maria");
		
		for (String i : comparando) {
		}
		
		System.out.println(comparando + "\n");
		
		System.out.println("Removendo pessoas da lista: ");
		
		comparando.remove("Jo�o");
		comparando.remove("Maria");
		
		System.out.println(comparando + "\n");
		
		System.out.println("Analisando se tem um determinado item na lista: ");
		
		System.out.println(comparando.contains("Ana"));
		System.out.println(comparando.contains("Jo�o"));
		
		long fim =  System.currentTimeMillis();
		long tempo = fim - come�o;
		
		System.out.println(tempo);
		
	}

}
