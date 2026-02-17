package Models;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    public Empleado(String nombre, int horasTrabajadas, double pagoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    public String getCategoriaSalario(double salario) {
        if (salario < 5000) {
            return "bajo";
        } else if (salario >= 5000 && salario <= 10000) {
            return "regular";
        } else {
            return "alto";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }
}
