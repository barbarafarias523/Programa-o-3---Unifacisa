package pacote;

import pacote2.ClassePublica2;

public class ClassePublica {
	
	private int vPrivada;
	
	int vDefault;
	
	protected int vProtegida;
	
	public int vPublica;
	
	public static void main(String[] args) {
		
		ClasseDefault cd = new ClasseDefault(); 
		//cd.vPrivada = 1; não está na mesma classe, então não consegue acessar
		cd.vDefault = 1;
		cd.vProtegida = 1;
		cd.vPublica = 1;
		
		ClassePublica cp = new ClassePublica(); 
		cp.vPrivada = 1; 
		cp.vDefault = 1;
		cp.vProtegida = 1;
		cp.vPublica = 1;
		
		//ClasseDefault2 cd2 = new ClasseDefault2(); não consegue acessar, pois não está no mesmo pacote
		//Não consegue acessar a classe e nem as variáveis e métodos
		
		ClassePublica2 cp2 = new ClassePublica2(); 
		//cp2.vPrivada = 1; não está na mesma classe, então não consegue acessar
		//cp2.vDefault = 1; não está no mesmo pacote, então não consegue acessar
		//cp2.vProtegida = 1;  não está no mesmo pacote e nem tem subclasse, então não consegue acessar
		cp2.vPublica = 1;
	}

}
