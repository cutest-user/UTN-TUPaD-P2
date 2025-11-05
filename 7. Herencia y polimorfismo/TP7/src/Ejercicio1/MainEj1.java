/*
PROGRAMACION II
MODULO 7: HERENCIA Y POLIMORFISMO
ALUMNO: LEPKA AGUSTIN
COMISION: 13
*/
package Ejercicio1;

public class MainEj1 {

    public static void main(String[] args) {
       //creamos un objeto Auto utilizando upcasting (tratado como Vehiculo)
        Vehiculo miAuto = new Auto("Toyota", "Corolla", 4);

        //llamamos al método que mostrará info
        miAuto.mostrarInfo();
    }

}
 