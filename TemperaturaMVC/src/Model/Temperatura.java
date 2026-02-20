package Model;

// Conversión de temperaturas


public class Temperatura {

    public float celsius_Fahrenheit(float celsius) {
        return (celsius * ((float) 9 / 5)) + 32;
    }

    public float fahrenheit_Celsius(float fahrenheit) {
        return (((float) 5 / 9) * (fahrenheit - 32));
    }
}
