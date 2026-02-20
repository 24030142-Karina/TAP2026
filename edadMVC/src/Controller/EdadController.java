package Controller;

import Model.Edad;
import View.Usuario;

// Coordinacion el modelo y la vista

public class EdadController {
    private Edad model;
    private Usuario view;

    public EdadController(Edad model, Usuario view) {
        this.model = model;
        this.view = view;
    }

    public void ejecutar() {
        int añoActual = view.getAñoActual();
        int edadActual = view.getEdadActual();
        int añoFuturo = view.getAñoFuturo();


        if (!model.validarAñoFuturo(añoFuturo, añoActual)) {
            view.mostrarError("El año introducido debe ser mayor o igual al año actual");
            return;
        }

        // Edad futura
        int edadFutura = model.EdadFutura(añoActual, edadActual, añoFuturo);

        view.mostrarEdadFutura(añoActual, edadActual, añoFuturo, edadFutura);
    }
}