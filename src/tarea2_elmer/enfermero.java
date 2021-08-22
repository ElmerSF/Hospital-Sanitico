//Clase Enfermero extendida de registro de datos

package tarea2_elmer;

public class enfermero extends registro_datos {
    private static boolean asistente;
    private static boolean obstetra;

    
    public enfermero(String tipo_empleado, int cedula, String nombre, String fecha_nacimiento, String fecha_ingreso, String sexo) {
        super(tipo_empleado, cedula, nombre, fecha_nacimiento, fecha_ingreso, sexo);
        
    }

    public static boolean isAsistente() {
        return asistente;
    }

    public static void setAsistente(boolean asistente) {
        enfermero.asistente = asistente;
    }

    public static boolean isObstetra() {
        return obstetra;
    }

    public static void setObstetra(boolean obstetra) {
        enfermero.obstetra = obstetra;
    }

    public enfermero() {
    }
    @Override
   public String muestraDatos (){
    
    return "cedula: "+getCedula()+"\nNombre: "+getNombre()+"\nFecha de Nacimiento: "+getFecha_nacimiento()+
            "\nFecha de Ingreso: "+getFecha_ingreso()+"\nSexo: "+getSexo()+"\nTipo de Empleado: "+getTipo_empleado()+
            "\nEs Asistente: "+asistente+"\nEs obstetra: "+obstetra+"\n\n\n"; 
   }
}
