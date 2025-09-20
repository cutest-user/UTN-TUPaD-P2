
package tp5ej14;

public class Proyecto {
    private String nombre;
    private int duracionMin;

    //Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto: " + nombre + " (" + duracionMin + " min)";
    }
}