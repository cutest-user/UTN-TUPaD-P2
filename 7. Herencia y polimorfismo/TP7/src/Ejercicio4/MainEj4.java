/*
PROGRAMACION II
MODULO 7: HERENCIA Y POLIMORFISMO
ALUMNO: LEPKA AGUSTIN
COMISION: 13
*/

package Ejercicio4;

public class MainEj4 {
   
    public static void main(String[] args) {
        //Array de animales (con polimorfismo)
        Animal[] animales = { new Perro(), new Gato(), new Vaca() };

        //Llamamos métodos
        for (Animal a : animales) {
            a.describirAnimal();//método heredado
            a.hacerSonido();//método sobrescrito según el animal
            System.out.println("----");
        }
    }

}
