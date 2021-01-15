package com.qa.temp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTemperatureConverter {

	// run once at start
	@BeforeAll
	public static void beforeAll() {

		System.out.println("Start of testing");

	}

	// run before each test
	@BeforeEach
	public void before() {

		System.out.println("Before a test");

	}
	
	@Test
	public void convertFahrenheitToCelsiusTest1() {

		TemperatureConverter tc = new TemperatureConverter();
		
		float result = tc.convertFahrenheitToCelsius(50);

		System.out.println(result);

		assertEquals(10f, result);

	}

	@Test
	public void convertCelsiusToFahrenheitTest2() {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		float result = tc.convertCelsiusToFahrenheit(10);

		System.out.println(result);
		
		assertEquals(50f, result);

	}
	
	@Test
	public void convertKelvinToCelsiusTest3() {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		float result = tc.convertKelvinToCelsius(300);

		System.out.println(result);
		
		assertEquals(27f, result);

	}
	
	@Test
	public void convertCelsiusToKelvinTest4() {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		float result = tc.convertCelsiusToKelvin(27);

		System.out.println(result);
		
		assertEquals(300f, result);

	}
	
	@Test
	public void convertKelvinToFahrenheitTest5() {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		float result = tc.convertKelvinToFahrenheit(300);

		System.out.println(result);
		
		assertEquals(80.6f, result);

	}
	
	@Test
	public void convertFahrenheitToKelvinTest6() {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		float result = tc.convertFahrenheitToKelvin(50);

		System.out.println(result);
		
		assertEquals(283f, result);

	}


	// After each test
	@AfterEach
	public void after() {

		System.out.println("After a test\n");

	}

	// Once after all tests
	@AfterAll
	public static void afterAll() {

		System.out.println("End of testing");

	}

}
