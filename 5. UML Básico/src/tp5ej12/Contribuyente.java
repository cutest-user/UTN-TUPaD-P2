
package tp5ej12;

public class Contribuyente {
    private String nombre;
    private String cuil;

    //constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente: " + nombre + " CUIL: " + cuil;
    }
}