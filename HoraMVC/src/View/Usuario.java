package View;

import java.util.Scanner;

public class Usuario {
    Scanner teclado = new Scanner(System.in);

    public int getHoraActual() {
        System.out.print("Hora actual: ");
        return teclado.nextInt();
    }

    public int getHorasTranscurridas() {
        System.out.print("Cantidad de horas: ");
        return teclado.nextInt();
    }

    public void mostrarResultado(int horaActual, int horas, int horaFutura) {
        System.out.println("En " + horas + " horas, el reloj marcara las " + horaFutura);
    }

    public void cerrar() {
        teclado.close();
    }
}