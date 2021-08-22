//Clase miscelaneos extendidada de registro de datos
package tarea2_elmer;

public class miscelaneos extends registro_datos {

    private static String labor_actual;

    public miscelaneos(String tipo_empleado, int cedula, String nombre, String fecha_nacimiento, String fecha_ingreso, String sexo) {
        super(tipo_empleado, cedula, nombre, fecha_nacimiento, fecha_ingreso, sexo);
    }

    public miscelaneos() {
    }

    public static String getLabor_actual() {
        return labor_actual;
    }

    public static void setLabor_actual(String labor_actual) {
        miscelaneos.labor_actual = labor_actual;
    }

    @Override
    public String muestraDatos() {
        return "cedula: " + getCedula() + "\nNombre: " + getNombre() + "\nFecha de Nacimiento: " + getFecha_nacimiento()
                + "\nFecha de Ingreso: " + getFecha_ingreso() + "\nSexo: " + getSexo() + "\nTipo de Empleado: " + getTipo_empleado()
                + "\nLabor Actual: " + labor_actual + "\n\n\n";

    }
}
