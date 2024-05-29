public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado(1, "Juan Pérez", "Desarrollador", 50000);
        Empleado empleado2 = new Empleado(2, "Ana Gómez", "Diseñadora", 45000);

        // Crear empresa
        Empresa empresa = new Empresa(1, "Tech Solutions");

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        // Mostrar detalles de la empresa y sus empleados
        System.out.println(empresa.obtenerDetalles());
        System.out.println("Detalles de los Empleados:\n");
        for (String detalles : empresa.listarEmpleados()) {
            System.out.println(detalles);
        }
    }
}
