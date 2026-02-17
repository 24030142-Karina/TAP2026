/* A partir de código adjunto realizar lo siguiente:

        1.- Crear un proyecto llamado Práctica 2 Cajero (utilizar git)
        2.- Importar el código propuesto (archivo adjunto) y entender el funcionamiento
        3.- Realizar una reestructuración del código separando la lógica de negocio usando MVC
        4.- Aplicar programación orientada a objetos para refactorizar el código
        5.- Utilizar estructuras de datos para almacenar la información y programación genérica donde lo requiera


 */

import Controller.CajeroController;

public class Main {
    public static void main(String[] args) {
        CajeroController controller = new CajeroController();
        controller.iniciar();
    }
}