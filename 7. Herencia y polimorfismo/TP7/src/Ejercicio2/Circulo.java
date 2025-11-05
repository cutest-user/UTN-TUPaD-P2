
package Ejercicio2;

//Clase Circulo que hereda de Figura
public class Circulo extends Figura {

    //Atributo específico del círculo
    private double radio;

    //Constructor del círculo
    public Circulo(double radio) {
        super("Circulo"); //Enviamos nombre a la clase madre
        this.radio = radio;
    }

    //Implementación del cálculo de área
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
