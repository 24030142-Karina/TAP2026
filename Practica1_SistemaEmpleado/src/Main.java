/*
PRACTICA 1
-- A partir del código adjunto, refactorizar el código utilizando OPP y MVC.

import java.util.Scanner;

public class SistemaEmpleado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del empleado:");
        String nombre = sc.nextLine();

        System.out.println("Horas trabajadas:");
        int horas = sc.nextInt();

        System.out.println("Pago por hora:");
        double pagoHora = sc.nextDouble();

        double salario = horas * pagoHora;

        System.out.println("Empleado: " + nombre);
        System.out.println("Salario calculado: $" + salario);

        if (salario > 10000) {
            System.out.println("Empleado con salario alto.");
        } else {
            System.out.println("Empleado con salario regular.");
        }

        sc.close();
    }
}
 */


import Controllers.EmpleadoController;

public class Main {
    public static void main(String[] args) {
        EmpleadoController controller = new EmpleadoController();
        controller.ejecutar();
    }
}

