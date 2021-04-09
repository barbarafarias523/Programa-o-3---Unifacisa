package TemperaturaExecption;

public class Main {

	public static void main(String[] args) {
		
		Converter converter = new Converter(19);
		
		try {
			converter.convertendo(800);
		} catch (FahrenheitException e) {
			e.printStackTrace();
		}
		
		try {
			converter.convertendo(25);
		} catch (FahrenheitException e) {
			e.printStackTrace();
		}
	}

}
