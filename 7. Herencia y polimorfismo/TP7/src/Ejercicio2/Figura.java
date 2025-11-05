
package Ejercicio2;
//Clase abstracta base para figuras
public abstract class Figura {

    //Nombre de la figura accesible en clases hijas
    protected String nombre;

    //Constructor para asignar nombre
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    //Método abstracto: las clases hijas deben implementarlo
    public abstract double calcularArea();

    //Método común para mostrar datos
    public void mostrar() {
        System.out.println(nombre + " - Area: " + calcularArea());
    }
}
