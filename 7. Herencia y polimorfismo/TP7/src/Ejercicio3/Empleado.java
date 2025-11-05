
package Ejercicio3;

//clase abstracta Empleado
public abstract class Empleado {

    //Nombre del empleado
    protected String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //metodo abstracto: cada tipo de empleado define su sueldo
    public abstract double calcularSueldo();
}
