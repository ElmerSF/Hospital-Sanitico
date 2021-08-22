//Clase Administrativos extendida de registro de datos
package tarea2_elmer;

public class administrativos extends registro_datos {
    
    private static String departamento;
    private static String centro_costos;

    public administrativos(String tipo_empleado, int cedula, String nombre, String fecha_nacimiento, String fecha_ingreso, String sexo) {
        super(tipo_empleado, cedula, nombre, fecha_nacimiento, fecha_ingreso, sexo);
    }

    public administrativos() {
    }

    public static String getDepartamento() {
        return departamento;
    }

    public static void setDepartamento(String departamento) {
        administrativos.departamento = departamento;
    }

    public static String getCentro_costos() {
        return centro_costos;
    }

    public static void setCentro_costos(String centro_costos) {
        administrativos.centro_costos = centro_costos;
    }
    @Override
     public String muestraDatos (){
    return "cedula: "+getCedula()+"\nNombre: "+getNombre()+"\nFecha de Nacimiento: "+getFecha_nacimiento()+
            "\nFecha de Ingreso: "+getFecha_ingreso()+"\nSexo: "+getSexo()+"\nTipo de Empleado: "+getTipo_empleado()+
            "\nDepartamento: "+departamento+"\nCentro de Costos: "+centro_costos+"\n\n\n";
    
     }
    
    
}
