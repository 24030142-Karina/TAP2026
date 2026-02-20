package Model;

// Calculos de edad

public class Edad {

    int añosTranscurridos;

    public int EdadFutura(int añoActual, int edadActual, int añoFuturo) {
        añosTranscurridos = añoFuturo - añoActual;
        return edadActual + añosTranscurridos;
    }

    public boolean validarAñoFuturo(int añoFuturo, int añoActual) {
        return añoFuturo >= añoActual;
    }
}
