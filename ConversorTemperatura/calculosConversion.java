package ConversorTemperatura;

public class calculosConversion {
	
	public static double celsiusFahrenheit(double celsius) {//operación para pasar los grados celsius a farenheit
		return (celsius *9)/5+32;
	}
	
	public static double celsiusKelvin(double celsius) {//operacion para convertir celsius a kelvin
		return celsius + 273.15;
	}
}
