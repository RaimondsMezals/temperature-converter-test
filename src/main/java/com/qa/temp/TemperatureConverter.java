package com.qa.temp;

public class TemperatureConverter {
	
	public float convertFahrenheitToCelsius(float fahrenheit) {
        return (5f / 9f) * (fahrenheit - 32f);
    }

    public float convertCelsiusToFahrenheit(float celsius) {
        return (9f / 5f) * (celsius) + 32f;
    }

    public float convertKelvinToCelsius(float kelvin) {
        return (kelvin - 273f);
    }

    public float convertCelsiusToKelvin(float celsius) {
        return (celsius + 273f);
    }

    public float convertKelvinToFahrenheit(float kelvin) {
        return (9f / 5f) * (kelvin - 273f) + 32f;
    }

    public float convertFahrenheitToKelvin(float fahrenheit) {
        return (5f / 9f) * (fahrenheit - 32f) + 273f;
    }
	
}
