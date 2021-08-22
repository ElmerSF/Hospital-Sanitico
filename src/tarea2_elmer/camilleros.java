//Clase camillero extendida de registro de datos

package tarea2_elmer;


public class camilleros extends registro_datos{
    private static int numero_camas;

    public camilleros(String tipo_empleado, int cedula, String nombre, String fecha_nacimiento, String fecha_ingreso, String sexo) {
        super(tipo_empleado, cedula, nombre, fecha_nacimiento, fecha_ingreso, sexo);
        
        
    }

    public camilleros() {
    }

    public static int getNumero_camas() {
        return numero_camas;
    }

    public static void setNumero_camas(int numero_camas) {
        camilleros.numero_camas = numero_camas;
    }
    @Override
     public String muestraDatos (){
    return "cedula: "+getCedula()+"\nNombre: "+getNombre()+"\nFecha de Nacimiento: "+getFecha_nacimiento()+
            "\nFecha de Ingreso: "+getFecha_ingreso()+"\nSexo: "+getSexo()+"\nTipo de Empleado: "+getTipo_empleado()+
            "\nEl numero de camas que atiende es: "+numero_camas+"\n\n\n"; 
     }
}
