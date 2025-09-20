
package tp5ej3;

public class Editorial {
    private String nombre;
    private String direccion;

    //Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial nombre:" + nombre + ", direccion:" + direccion;
    }
}

