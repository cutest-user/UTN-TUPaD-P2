
package Ejercicio2;

//Clase Rectangulo que hereda de Figura
public class Rectangulo extends Figura {

    //Atributos exclusivos del rectángulo
    private double ancho;
    private double alto;

    //Constructor del rectángulo
    public Rectangulo(double ancho, double alto) {
        super("Rectangulo"); //Se envía el nombre a Figura
        this.ancho = ancho;
        this.alto = alto;
    }

    //Implementamos el cálculo del área
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
