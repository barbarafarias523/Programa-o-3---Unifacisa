package AtividadeCollection;

import java.util.ArrayList;

public class OrderedList {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		System.out.println("Adicionando na lista: ");
		
		lista.add(new Conta(1, 65, 50000, "Bárbara"));
		lista.add(new Conta(2, 94, 35000, "Luiz"));
		lista.add(new Conta(3, 23, 400, "Maria"));
		
		System.out.println(lista + "\n");
		
		System.out.println("Removendo da lista: ");
		
		lista.remove(2);
		
		System.out.println(lista + "\n");
		
		System.out.println("Tamanho da lista: " + lista.size());
	}

}
