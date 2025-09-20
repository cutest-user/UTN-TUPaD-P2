//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cbu;

    //constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //setter
    public void setCuentaBancaria(CuentaBancaria cbu){
    this.cbu = cbu;
    }

    @Override
    public String toString() {
        return "Titular nombre:" + nombre + ", dni:" + dni;
    }
}
