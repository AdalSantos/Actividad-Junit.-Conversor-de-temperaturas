package ConversorTemperatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class convTemp {
	//prueba con 2º grados celsius a fahrenheit y kelvin
	@Test
	public void celsius_2() {
		double celsius = 2;
		double fahrenheit = 35.6;
		double kelvin = 275.15;
		
		//verifica que la conversión de Celsius a Fahrenheit es correcta
		assertEquals(fahrenheit,calculosConversion.celsiusFahrenheit(celsius), 0.01);
		//verifica que la conversión de Celsius a Kelvin es correcta
		assertEquals(kelvin, calculosConversion.celsiusKelvin(celsius), 0.01);
	}
	
	//prueba con 3º grados celsius a fahrenheit y kelvin
	@Test
	public void Celsius_3() {
		double celsius = 3;
		double fahrenheit = 37.4;
		double kelvin = 276.15;
		
		//verifica que la conversión de Celsius a Fahrenheit es correcta
		assertEquals(fahrenheit,calculosConversion.celsiusFahrenheit(celsius), 0.01);
		//verifica que la conversión de Celsius a Kelvin es correcta
		assertEquals(kelvin, calculosConversion.celsiusKelvin(celsius), 0.01);
	}
	
	//prueba con 4º grados celsius a fahrenheit y kelvin
	@Test
	public void Celsius_4() {
		double celsius = 4;
		double fahrenheit = 39.2;
		double kelvin = 277.15;
		
		//verifica que la conversión de Celsius a Fahrenheit es correcta
		assertEquals(fahrenheit,calculosConversion.celsiusFahrenheit(celsius), 0.01);
		//verifica que la conversión de Celsius a Kelvin es correcta
		assertEquals(kelvin, calculosConversion.celsiusKelvin(celsius), 0.01);
	}

}
