/*
Combierte de grados Celsius a Fahrenheit y viceversa
 */

import Controller.TempController;
import View.User;
import Model.Temperatura;

public class Main {
    public static void main(String[] args) {

        Temperatura model = new Temperatura();
        User view = new User();
        TempController controller = new TempController(model, view);

        view.showMenu();
        int option = view.getMenuOption();
        controller.processOption(option);
        view.close();
    }
}
