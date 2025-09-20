//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    
    //Constructor
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    //setter
    public void setVehiculo(Vehiculo vehiculo){
    this.vehiculo = vehiculo;
    }
    //getter
    public Vehiculo getVehiculo(){
    return vehiculo;
    
    }
    @Override
    public String toString() {
        return "Conductor nombre:" + nombre + ", licencia:" + licencia;
    }
}
