/*
Codigo que pregunte al usuario, la hora actual y un numero entero de horas
que indique que hora sera en un numero determinado de horas
 */


import Controller.HoraController;
import Model.Reloj;
import View.Usuario;

public class Main {
    public static void main(String[] args) {

        Reloj model = new Reloj();
        Usuario view = new Usuario();
        HoraController controller = new HoraController(model, view);
        controller.ejecutar();
        view.cerrar();
    }
}
