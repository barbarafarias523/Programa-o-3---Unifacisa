package pacote;

import pacote2.ClassePublica2;

class ClasseDefault {
	
	private int vPrivada;
	
	int vDefault;
	
	protected int vProtegida;
	
	public int vPublica;
	
	public static void main(String[] args) {
		
		ClasseDefault cd = new ClasseDefault(); //consegue acessar ele mesmo
		cd.vPrivada = 1;
		cd.vDefault = 1;
		cd.vProtegida = 1;
		cd.vPublica = 1;
		
		ClassePublica cp = new ClassePublica(); //consegue acessar, pois é visivel para todos
		//cp.vPrivada = 1; não foi possivel acessar, porque não está na mesma classe
		cp.vDefault = 1;
		cp.vProtegida = 1;
		cp.vPublica = 1;
		
		//ClasseDefault2 cd2 = new ClasseDefault2(); não consegue acessar, pois não está no mesmo pacote
		//Não consegue acessar a classe e nem as variáveis e métodos
		
		ClassePublica2 cp2 = new ClassePublica2(); //consegue acessar através de importação
		//cp2.vPrivada = 1; sem acesso, pois não está na mesma classe
		//cp2.vDefault = 1; visivel apenas para quem está no mesmo pacote
		//cp2.vProtegida = 1; visivel apenas para quem está no mesmo pacote ou para subclasse
		cp2.vPublica = 1;
	}

}
