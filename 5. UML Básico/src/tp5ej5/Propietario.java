
package tp5ej5;

public class Propietario {
    private String nombre;
    private String dni;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Propietario nombre:" + nombre + ", dni:" + dni;
    }
}
