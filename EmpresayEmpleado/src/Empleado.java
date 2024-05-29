public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(int idEmpleado, String nombre, String puesto, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Métodos
    public String obtenerDetalles() {
        return "ID: " + idEmpleado + "\n" +
               "Nombre: " + nombre + "\n" +
               "Puesto: " + puesto + "\n" +
               "Salario: " + salario + "\n";
    }

    public void actualizarPuesto(String nuevoPuesto) {
        this.puesto = nuevoPuesto;
    }

    public void actualizarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }
}
