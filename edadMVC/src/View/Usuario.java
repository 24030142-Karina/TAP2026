package View;

// Interacción con el usuario

import java.util.Scanner;

public class Usuario {

    Scanner teclado = new Scanner(System.in);

    public int getAñoActual() {
        System.out.print("Año actual: ");
        return teclado.nextInt();
    }

    public int getEdadActual() {
        System.out.print("Edad actual de la persona: ");
        return teclado.nextInt();
    }

    public int getAñoFuturo() {
        System.out.print("Año que deseas saber la edad futura: ");
        return teclado.nextInt();
    }

    public void mostrarEdadFutura(int añoActual, int edadActual, int añoFuturo, int edadFutura) {
        System.out.println("\n&&&&& EDAD FUTURA &&&&&");
        System.out.printf("En el año %d, la persona de %d años (en %d)%n",
                añoFuturo, edadActual, añoActual);
        System.out.printf("tendrá %d años.%n", edadFutura);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public void cerrar() {
        teclado.close();
    }
}