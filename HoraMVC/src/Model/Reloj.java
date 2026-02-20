package Model;

/* cálculo de horas

Formato del reloj: 12 horas

Calculos: se resta 1 antes de la operación y se suma 1 después para buen manejo
          del rango 1-12 en lugar de 0-11
 */

public class Reloj {

    public int calcularHoraFutura(int horaActual, int horasTranscurridas) {
        return ((horaActual - 1 + horasTranscurridas) % 12) + 1;
    }
}
