//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej2;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;//Asociación bidireccional

    //constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //setter
    public void setCelular(Celular celular){
    this.celular = celular;
    }
    //getter
    public Celular getCelular(){
    return celular;
    }


    @Override
    public String toString() {
        return "Usuario: nombre: " + nombre + ", dni: " + dni;
    }
}
