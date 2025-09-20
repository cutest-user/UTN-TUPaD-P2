
package tp5ej11;

public class Artista {
    private String nombre;
    private String genero;

    //constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista: " + nombre + " - Género: " + genero;
    }
}