package org.example;

public class TemperatureConverter {

    Double fahrenheit,celsius;


    public String celsiusToFahrenheit(Double c){

        fahrenheit = (c * 1.8) + 32;
        return String.format("%.1f",fahrenheit);
    }

    public String fahrenheitToCelsius(Double f){

        celsius = ((f-32)*5)/9;
        return String.format("%.1f",celsius);
    }

}
