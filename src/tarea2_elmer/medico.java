//Clase medico, extendida de resgistro de datos
package tarea2_elmer;

public class medico extends registro_datos {

    private static String especialidad;
    private static int certificaciones;

    public medico(String especialidad, int certificaciones, String tipo_empleado, int cedula, String nombre, String fecha_nacimiento, String fecha_ingreso, String sexo) {
        super(tipo_empleado, cedula, nombre, fecha_nacimiento, fecha_ingreso, sexo);
        this.especialidad = especialidad;
        this.certificaciones = certificaciones;
    }

    public medico() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(int certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public String muestraDatos() {

        return "cedula: " + getCedula() + "\nNombre: " + getNombre() + "\nFecha de Nacimiento: " + getFecha_nacimiento()
                + "\nFecha de Ingreso: " + getFecha_ingreso() + "\nSexo: " + getSexo() + "\nTipo de Empleado: " + getTipo_empleado()
                + "\nEspecialidad: " + especialidad + "\nCertificaciones: " + certificaciones + "\n\n\n";

    }

}
