package Model;

// Operaciones matematicas


public class Circunferencia {

    public double calcularLongitud(double radio) {
        return 2 * Math.PI * radio;
    }

    public double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
}