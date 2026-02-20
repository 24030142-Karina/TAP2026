
/*
Codigo que pide el radio de una circunferenciay que calcule la longitud y el area incluida adentro
 */


import Controller.CircunferenciaController;
import Model.Circunferencia;
import View.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE CIRCUNFERENCIA ===\n");

        Circunferencia model = new Circunferencia();
        Usuario view = new Usuario();
        CircunferenciaController controller = new CircunferenciaController(model, view);

        controller.ejecutar();
        view.cerrar();
    }
}
