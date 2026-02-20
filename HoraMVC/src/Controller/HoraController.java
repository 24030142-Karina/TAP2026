package Controller;

import Model.Reloj;
import View.Usuario;


public class HoraController {
    private Reloj model;
    private Usuario view;

    public HoraController(Reloj model, Usuario view) {
        this.model = model;
        this.view = view;
    }

    public void ejecutar() {
        int horaActual = view.getHoraActual();
        int horas = view.getHorasTranscurridas();
        int horaFutura = model.calcularHoraFutura(horaActual, horas);
        view.mostrarResultado(horaActual, horas, horaFutura);
    }
}