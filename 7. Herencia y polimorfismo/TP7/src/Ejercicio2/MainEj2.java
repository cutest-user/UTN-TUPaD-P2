/*
PROGRAMACION II
MODULO 7: HERENCIA Y POLIMORFISMO
ALUMNO: LEPKA AGUSTIN
COMISION: 13
*/
package Ejercicio2;


public class MainEj2 {

    public static void main(String[] args) {
      
        //Creamos un arreglo de tipo Figura que almacena hijos
        Figura[] figuras = {
            new Circulo(4), //Circulo con radio 4
            new Rectangulo(5, 10)//Rectángulo 5x10
        };

        //Recorremos e invocamos métodos de polimorfismo
        for (Figura f : figuras) {
            f.mostrar(); //cada figura usa su propia versión de calcularArea
           }
        
       

    }
}
