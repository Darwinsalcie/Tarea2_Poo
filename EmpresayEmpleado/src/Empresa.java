import java.util.ArrayList;

public class Empresa {
    private int idEmpresa;
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    // Constructor
    public Empresa(int idEmpresa, String nombreEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    // Métodos
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<String> listarEmpleados() {
        ArrayList<String> detallesEmpleados = new ArrayList<>();
        for (Empleado empleado : empleados) {
            detallesEmpleados.add(empleado.obtenerDetalles());
        }
        return detallesEmpleados;
    }

    public String obtenerDetalles() {
        return "ID Empresa: " + idEmpresa + "\n" +
               "Nombre Empresa: " + nombreEmpresa + "\n" +
               "Número de Empleados: " + empleados.size() + "\n";
    }
}
