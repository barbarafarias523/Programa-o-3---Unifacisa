package pacote;

import pacote2.ClassePublica2;

public class ClassePublica {
	
	private int vPrivada;
	
	int vDefault;
	
	protected int vProtegida;
	
	public int vPublica;
	
	public static void main(String[] args) {
		
		ClasseDefault cd = new ClasseDefault(); 
		//cd.vPrivada = 1; n�o est� na mesma classe, ent�o n�o consegue acessar
		cd.vDefault = 1;
		cd.vProtegida = 1;
		cd.vPublica = 1;
		
		ClassePublica cp = new ClassePublica(); 
		cp.vPrivada = 1; 
		cp.vDefault = 1;
		cp.vProtegida = 1;
		cp.vPublica = 1;
		
		//ClasseDefault2 cd2 = new ClasseDefault2(); n�o consegue acessar, pois n�o est� no mesmo pacote
		//N�o consegue acessar a classe e nem as vari�veis e m�todos
		
		ClassePublica2 cp2 = new ClassePublica2(); 
		//cp2.vPrivada = 1; n�o est� na mesma classe, ent�o n�o consegue acessar
		//cp2.vDefault = 1; n�o est� no mesmo pacote, ent�o n�o consegue acessar
		//cp2.vProtegida = 1;  n�o est� no mesmo pacote e nem tem subclasse, ent�o n�o consegue acessar
		cp2.vPublica = 1;
	}

}
