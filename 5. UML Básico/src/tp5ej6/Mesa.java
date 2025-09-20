//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej6;

public class Mesa {
    private int numero;
    private int capacidad;

    //constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa numero:" + numero + ", capacidad:" + capacidad;
    }
}
