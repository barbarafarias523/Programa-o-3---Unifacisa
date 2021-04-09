package TemperaturaExecption;

public class Converter {
	
	private double temperaturaC;
	
	public Converter(double temperaturaC) {
		super();
		this.temperaturaC = temperaturaC;
	}

	public double convertendo(double temperaturaF) throws FahrenheitException{
		if(temperaturaF >= -459.67) {
			temperaturaC = (5 * (temperaturaF - 32)) / 9;
				return temperaturaC;
		}else {
			throw new FahrenheitException();
		}
	}

	public double getTemperaturaC() {
		return temperaturaC;
	}

	public void setTemperaturaC(double temperaturaC) {
		this.temperaturaC = temperaturaC;
	}
	
	

}
