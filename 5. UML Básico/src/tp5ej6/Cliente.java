
package tp5ej6;

public class Cliente {
    private String nombre;
    private String telefono;

    //constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente nombre:" + nombre + ", telefono:" + telefono;
    }
}
