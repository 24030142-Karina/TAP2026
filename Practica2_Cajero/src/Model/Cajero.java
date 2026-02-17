package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Cajero {
        private Map<String, Cliente> usuarios;
        private List<String> historialTransacciones;

        public Cajero() {
            usuarios = new HashMap<>();
            historialTransacciones = new ArrayList<>();
            inicializarUsuarios();
        }

        private void inicializarUsuarios() {
            usuarios.put("1234", new Cliente("1234", "Juan", 1000.0));
            usuarios.put("5678", new Cliente("5678", "Maria", 2500.0));
        }

        public Cliente autenticarUsuario(String pin) {
            return usuarios.get(pin);
        }

        public void registrarTransaccion(String transaccion) {
            historialTransacciones.add(transaccion);
        }

        public List<String> getHistorialTransacciones() {
            return new ArrayList<>(historialTransacciones);
        }

        //Programación Génerica
        public <T extends Number> boolean validarCantidadPositiva(T cantidad) {
            return cantidad.doubleValue() > 0;
        }
    }

