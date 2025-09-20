//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej13;

public class Usuario {
    private String nombre;
    private String email;

    //constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " - Email: " + email;
    }
}