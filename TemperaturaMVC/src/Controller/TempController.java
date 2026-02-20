package Controller;

import Model.Temperatura;
import View.User;

public class TempController {
    private Temperatura model;
    private User view;

    public TempController(Temperatura model, User view) {
        this.model = model;
        this.view = view;
    }

    public void processOption(int option) {
        if (option == 1) {
            handleCelsiusToFahrenheit();
        } else if (option == 2) {
            handleFahrenheitToCelsius();
        } else {
            view.showError("Opción no válida. Por favor, ingrese 1 o 2.");
        }
    }

    private void handleCelsiusToFahrenheit() {
        float celsius = view.getTemperatureInput("Celsius");
        float fahrenheit = model.celsius_Fahrenheit(celsius);
        view.showResult(celsius, fahrenheit, "Celsius", "Fahrenheit");
    }

    private void handleFahrenheitToCelsius() {
        float fahrenheit = view.getTemperatureInput("Fahrenheit");
        float celsius = model.fahrenheit_Celsius(fahrenheit);
        view.showResult(fahrenheit, celsius, "Fahrenheit", "Celsius");
    }
}