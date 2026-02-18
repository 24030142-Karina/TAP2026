/*
Escriba
 */

java.util.Scanner;
void main() {
    int horaActual;
    int cantidadHoras;
    int horaResultado=0;
    Scanner v_teclado = new Scanner(System.in);
    System.out.println("Cual es la Hora Actual?");
    horaActual= v_teclado.nextInt();
    v_teclado.nextLine();
    System.out.println("Cantidad de horas:");
    cantidadHoras=v_teclado.nextInt();
    v_teclado.nextLine();

    horaResultado=horaActual+cantidadHoras;
    if(horaResultado>24){

    }

    do{



    }while(horaResultado<=24);
}

