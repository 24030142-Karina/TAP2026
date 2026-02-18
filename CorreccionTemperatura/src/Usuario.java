// Clase que hace la interacción del codigo con el usuario

import java.util.Scanner;
class Usuario {
    private Scanner scanner;
    private Temperatura conversor;

    public Usuario() {
        this.scanner = new Scanner(System.in);
        this.conversor = new Temperatura();
    }

    public void mostrarMenu() {
        System.out.println("///// CONVERTIDOR DE TEMPERATURAS /////");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.println("//////////////////////////////////////");
    }

    public void procesarOpcion(int opcion) {
        if (opcion == 1) {
            convertirCelsiusAFahrenheit();
        } else if (opcion == 2) {
            convertirFahrenheitACelsius();
        } else {
            System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
        }
    }

    private void convertirCelsiusAFahrenheit() {
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        float celsius = scanner.nextFloat();
        float fahrenheit = conversor.celsiusAFahrenheit(celsius);
        System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit%n", celsius, fahrenheit);
    }

    private void convertirFahrenheitACelsius() {
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        float celsius = conversor.fahrenheitACelsius(fahrenheit);
        System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius%n", fahrenheit, celsius);
    }

    public void cerrar() {
        scanner.close();
    }
}

