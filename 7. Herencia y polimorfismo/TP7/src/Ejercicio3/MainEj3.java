/*
PROGRAMACION II
MODULO 7: HERENCIA Y POLIMORFISMO
ALUMNO: LEPKA AGUSTIN
COMISION: 13
*/
package Ejercicio3;
import java.util.ArrayList;
public class MainEj3 {

    
    public static void main(String[] args) {
        //Lista polimórfica con Empleado
        ArrayList<Empleado> empleados = new ArrayList<>();

        //Agregamos distintos tipos de empleado
        empleados.add(new EmpleadoPlanta("Ana", 500000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 15000));

        //Recorremos la lista y usamos polimorfismo
        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra $" + e.calcularSueldo());

            //instanceof para identificar tipo real
            if (e instanceof EmpleadoTemporal) {
                EmpleadoTemporal temp = (EmpleadoTemporal) e; //downcasting
                System.out.println("Días trabajados: " + temp.getDiasTrabajados());
            }
    }

}
    
}
