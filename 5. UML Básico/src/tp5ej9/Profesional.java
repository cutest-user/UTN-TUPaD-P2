//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej9;

public class Profesional {
    private String nombre;
    private String especialidad;

    //constructor
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesional nombre:" + nombre + ", especialidad:" + especialidad;
    }
}
