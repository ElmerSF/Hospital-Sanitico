/*
AQUI SE VAN A ALMACENAR LOS DATOS
ESTA SERÁ LA SUPER CLASE O CLASE MADRE
 */
package tarea2_elmer;

import javax.swing.JOptionPane;

public class registro_datos {

    formulario_basico dat = new formulario_basico();
    formulario_avanzado pos = new formulario_avanzado();

    private static String tipo_empleado = "";
    private static int cedula = 0;
    private static String nombre = "";
    private static String fecha_nacimiento = "";
    private static String fecha_ingreso = "";
    private static String sexo = "";

    public registro_datos(String tipo_empleado, int cedula, String nombre, String fecha_nacimiento, String fecha_ingreso, String sexo) {
        this.tipo_empleado = tipo_empleado;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.sexo = sexo;
    }

    public registro_datos() {
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String muestraDatos() {

        return "cedula: " + getCedula() + "\nNombre: " + getNombre() + "\nFecha de Nacimiento: " + getFecha_nacimiento()
                + "\nFecha de Ingreso: " + getFecha_ingreso() + "\nSexo: " + getSexo() + "\nTipo de Empleado: " + getTipo_empleado() + "\n";

    }

}
