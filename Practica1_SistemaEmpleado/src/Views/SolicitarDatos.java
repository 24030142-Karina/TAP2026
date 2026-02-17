package Views;

import java.util.Scanner;

public class SolicitarDatos {

        Scanner teclado = new Scanner(System.in);

        public String solicitarNombre() {
            System.out.println("Nombre del empleado: ");
            return teclado.nextLine();
        }

        public int solicitarHoras() {
            System.out.println("Horas trabajadas:");
            return teclado.nextInt();
        }

        public double solicitarPagoHora() {
            System.out.println("Pago por hora:");
            return teclado.nextDouble();
        }

        public void mostrarResultados(String nombre, double salario, String categoria) {
            System.out.println("\n&&&&& SISTEMAS DE EMPLEADO &&&&& \n");
            System.out.println("Empleado: " + nombre);
            System.out.println("Salario calculado: $" + salario);
            System.out.println("Empleado con salario " + categoria + ".");
        }

        public void cerrar() {
            teclado.close();
        }

}
