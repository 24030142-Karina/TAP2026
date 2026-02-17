package Controller;

import Model.Cajero;
import Model.Cliente;
import View.CajeroView;

public class CajeroController {
    private Cajero cajero;
    private CajeroView view;
    private Cliente usuarioActual;
    private static final int MAX_INTENTOS = 3;

    public CajeroController() {
        this.cajero = new Cajero();
        this.view = new CajeroView();
    }

    public void iniciar() {
        view.mostrarBienvenida();

        if (autenticarUsuario()) {
            ejecutarMenuPrincipal();
        }
    }

    private boolean autenticarUsuario() {
        int intentos = 0;

        while (intentos < MAX_INTENTOS) {
            String pin = view.solicitarPin();
            usuarioActual = cajero.autenticarUsuario(pin);

            if (usuarioActual != null) {
                view.mostrarMensaje("Bienvenido, " + usuarioActual.getNombre());
                return true;
            } else {
                intentos++;
                view.mostrarPinIncorrecto(MAX_INTENTOS - intentos);
            }
        }

        view.mostrarDemasiadosIntentos();
        return false;
    }

    private void ejecutarMenuPrincipal() {
        boolean salir = false;

        while (!salir) {
            view.mostrarMenu();
            int opcion = view.obtenerOpcion();

            switch (opcion) {
                case 1:
                    verSaldo();
                    break;
                case 2:
                    retirarDinero();
                    break;
                case 3:
                    depositarDinero();
                    break;
                case 4:
                    salir = true;
                    view.mostrarDespedida();
                    break;
                default:
                    view.mostrarError("Opción no válida");
            }
        }
    }

    private void verSaldo() {
        view.mostrarSaldo(usuarioActual.getSaldo());
        cajero.registrarTransaccion("Consulta de saldo - Usuario: " + usuarioActual.getNombre());
    }

    private void retirarDinero() {
        double cantidad = view.solicitarCantidad("retirar");

        if (!cajero.validarCantidadPositiva(cantidad)) {
            view.mostrarError("La cantidad debe ser positiva");
            return;
        }

        if (usuarioActual.retirar(cantidad)) {
            view.mostrarOperacionExitosa("Retiro", usuarioActual.getSaldo());
            cajero.registrarTransaccion("Retiro: $" + cantidad + " - Usuario: " + usuarioActual.getNombre());
        } else {
            view.mostrarError("Fondos insuficientes");
        }
    }

    private void depositarDinero() {
        double cantidad = view.solicitarCantidad("depositar");

        if (!cajero.validarCantidadPositiva(cantidad)) {
            view.mostrarError("La cantidad debe ser positiva");
            return;
        }

        usuarioActual.depositar(cantidad);
        view.mostrarOperacionExitosa("Depósito", usuarioActual.getSaldo());
        cajero.registrarTransaccion("Depósito: $" + cantidad + " - Usuario: " + usuarioActual.getNombre());
    }
}