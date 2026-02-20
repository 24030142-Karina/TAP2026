package View;

// Interacción con el usuario

import java.util.Scanner;

public class Usuario {
    Scanner teclado = new Scanner(System.in);

    public double getRadio() {
        System.out.print("Radio de la circunferencia: ");
        return teclado.nextDouble();
    }

    public void mostrarResultados(double radio, double longitud, double area) {
        System.out.println("\n&&&&& CIRCUNFERENCIA &&&&&");
        System.out.printf("Radio: %.2f%n", radio);
        System.out.printf("Longitud de la circunferencia: %.2f%n", longitud);
        System.out.printf("Área del círculo: %.2f%n", area);
    }

    public void cerrar() {
        teclado.close();
    }
}