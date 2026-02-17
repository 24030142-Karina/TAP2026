package Controllers;


import Models.Empleado;
import Views.SolicitarDatos;

public class EmpleadoController {
    private SolicitarDatos vista;

    public EmpleadoController() {
        this.vista = new SolicitarDatos();
    }

    public void ejecutar() {
        try {

            String nombre = vista.solicitarNombre();
            int horas = vista.solicitarHoras();
            double pagoHora = vista.solicitarPagoHora();

            Empleado empleado = new Empleado(nombre, horas, pagoHora);
            double salario = empleado.calcularSalario();
            String categoria = empleado.getCategoriaSalario(salario);

            vista.mostrarResultados(nombre, salario, categoria);

        } catch (Exception e) {
            System.out.println("Error: respuesta no válida");
        } finally {
            vista.cerrar();
        }
    }
}