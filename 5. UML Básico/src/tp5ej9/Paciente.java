//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej9;

public class Paciente {
    private String nombre;
    private String obraSocial;

    //constructor
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente nombre:" + nombre + ", obraSocial:" + obraSocial;
    }
}
