/*
Correccion del codigo "temperatura" del equipo 6
El codigo: Convierte de Celsius a Fahrenheit y Convierte de Fahrenheit a Celsius

    --codigo original, equipo 6:

package Temperatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float entradaf;

        System.out.println("Ingresa 1 para convertir de celsius y 2 para convertir de farenheit: ");
        int entrada = scanner.nextInt();

        if (entrada == 1){
            System.out.println("Valor en farenheit: ");
            entradaf = scanner.nextFloat();
            System.out.printf("%3.2f",conversorCelsius(entradaf));
        }
        else if(entrada == 2){
            System.out.println("Valor en celsius: ");
            entradaf = scanner.nextFloat();
            System.out.printf("%3.2f", conversorFarenheit(entradaf));
        }
    }

    static float conversorCelsius(float valorFarenheit){
        return (((float) 5 / 9) * (valorFarenheit - 32));
    }

    static float conversorFarenheit(float valorCelsius){
        return ((valorCelsius * ((float) 9 / 5)) + 32);
    }
}
 */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario();
        user.mostrarMenu();

        Scanner tempScanner = new Scanner(System.in);
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = tempScanner.nextInt();
        user.procesarOpcion(opcion);
        user.cerrar();
        tempScanner.close();
    }
}
 /*
 Los cambios las mejoras que se le agregaron son:
    - Dividirlo en clases
    - Mejorar los mensajes de salida
    - Mejoro la clase de usuario, para que funcione mejor
  */
