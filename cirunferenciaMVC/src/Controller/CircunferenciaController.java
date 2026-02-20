package Controller;

import Model.Circunferencia;
import View.Usuario;

public class CircunferenciaController {
    private Circunferencia model;
    private Usuario view;

    public CircunferenciaController(Circunferencia model, Usuario view) {
        this.model = model;
        this.view = view;
    }

    public void ejecutar() {

        double radio = view.getRadio(); // Radio
        double longitud = model.calcularLongitud(radio); // longitud
        double area = model.calcularArea(radio); // Area

        view.mostrarResultados(radio, longitud, area);
    }
}