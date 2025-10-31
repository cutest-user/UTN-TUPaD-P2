/*
PROGRAMACION II - TRABAJO PRACTICO 6

ALUMNO: LEPKA AGUSTIN MARIO NICOLAS
COMISION: 13
*/
package tp6;

public class Autor {
    //atributos
    private String id;
    private String nombre;
    private String nacionalidad;

    //constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }

    //getter
    public String getNombre() {
        return nombre;
    }
}
