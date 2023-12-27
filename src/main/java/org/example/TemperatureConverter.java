package org.example;

public class TemperatureConverter {

    double fahrenheit;
    static double celsius;


    public String celsiusToFahrenheit(double c){

        fahrenheit = (c * 1.8) + 32;
        return String.format("%.1f",fahrenheit);
    }

    public String fahrenheitToCelsius(double f){

        celsius = ((f-32)*5)/9;
        return String.format("%.1f",celsius);
    }

    public static String fToC(double f){

        celsius = ((f-32)*5)/9;
        return String.format("%.1f",celsius);
    }

    public double celsiusToKelvin(double c){

        return c+273.15;
    }

}
