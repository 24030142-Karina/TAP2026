/*
Codigo que pregunte el año actual y la edad de una persona
y calcule la edad de esa persona en un año determinado
 */

import Controller.EdadController;
import Model.Edad;
import View.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("&&&&& CALCULADORA DE EDAD &&&&&\n");

        Edad model = new Edad();
        Usuario view = new Usuario();
        EdadController controller = new EdadController(model, view);

        controller.ejecutar();
        view.cerrar();
    }
}