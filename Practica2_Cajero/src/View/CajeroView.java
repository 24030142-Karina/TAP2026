package View;

import java.util.Scanner;

public class CajeroView {
    private Scanner scanner;

    public CajeroView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarBienvenida() {
        System.out.println("=== Bienvenido al Cajero ===");
    }

    public String solicitarPin() {
        System.out.print("Ingresa tu PIN: ");
        return scanner.nextLine();
    }

    public void mostrarPinIncorrecto(int intentosRestantes) {
        System.out.println("PIN incorrecto, te quedan: " + intentosRestantes + " intentos");
    }

    public void mostrarDemasiadosIntentos() {
        System.out.println("Demasiados intentos fallidos, porfavor intantalo mas tarde.");
    }

    public void mostrarMenu() {
        System.out.println("\n&&&&& CAJERO MENÚ &&&&&");
        System.out.println("1. Saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");
        System.out.print("Seleccione la opción deseada: ");
    }

    public int obtenerOpcion() {
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    public double solicitarCantidad(String operacion) {
        System.out.print("Ingresa la cantidad a " + operacion + ": ");
        return scanner.nextDouble();
    }

    public void mostrarSaldo(double saldo) {
        System.out.printf("Su saldo disponible es de: $%.2f%n", saldo);
    }

    public void mostrarOperacionExitosa(String operacion, double nuevoSaldo) {
        System.out.printf("%s ¡Excelente!, Ahora tu saldo es: $%.2f%n", operacion, nuevoSaldo);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public void mostrarDespedida() {
        System.out.println("Gracias por su preferencia, tenga un buen día.");
    }

    public void limpiarBuffer() {
        scanner.nextLine();
    }
}