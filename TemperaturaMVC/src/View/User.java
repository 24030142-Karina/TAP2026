package View;

// Interacción con el usuario

import java.util.Scanner;

public class User {
    Scanner teclado = new Scanner(System.in);

    public void showMenu() {
        System.out.println("_________________________________________");
        System.out.println("&&&&& CONVERTIDOR DE TEMPERATURAS &&&&&");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.println("_________________________________________");
    }

    public int getMenuOption() {
        System.out.print("Seleccione una opción (1 o 2): ");
        return teclado.nextInt();
    }

    public float getTemperatureInput(String scale) {
        System.out.print("Ingrese la temperatura en grados " + scale + ": ");
        return teclado.nextFloat();
    }

    public void showResult(float input, float output, String fromScale, String toScale) {
        System.out.printf("%.2f grados %s son %.2f grados %s%n",
                input, fromScale, output, toScale);
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    public void close() {
        teclado.close();
    }
}