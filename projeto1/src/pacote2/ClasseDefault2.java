package pacote2;


import pacote.ClassePublica;

class ClasseDefault2 {
	
	private int vPrivada;
	
	int vDefault;
	
	protected int vProtegida;
	
	public int vPublica;
	
	
	public static void main(String[] args) {
		
		//ClasseDefault cd = new ClasseDefault(); 
		//cd.vPrivada = 1;
		//cd.vDefault = 1;
		//cd.vProtegida = 1;
		//cd.vPublica = 1;
		//n?o ? poss?vel acessar nem a classe e nem as vari?veis e m?todos, pois, est? em pacote diferente
		
		ClassePublica cp = new ClassePublica(); 
		//cp.vPrivada = 1; sem acesso, pois n?o est? na mesma classe
		//cp.vDefault = 1; sem acesso, pois n?o est? no mesmo pacote
		//cp.vProtegida = 1; sem acesso, pois n?o est? no mesmo pacote e n?o ? subclasse
		cp.vPublica = 1;
		
		ClasseDefault2 cd2 = new ClasseDefault2();
		cd2.vPrivada = 1; 
		cd2.vDefault = 1; 
		cd2.vProtegida = 1; 
		cd2.vPublica = 1;
		
		
		ClassePublica2 cp2 = new ClassePublica2(); 
		//cp2.vPrivada = 1; sem acesso, pois n?o est? na mesma classe
		cp2.vDefault = 1; 
		cp2.vProtegida = 1; 
		cp2.vPublica = 1;
	}
}
