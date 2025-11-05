
package Ejercicio3;

//Empleado de planta que tiene sueldo fijo
public class EmpleadoPlanta extends Empleado {

    private double sueldoBase;

    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre); // enviamos nombre a la clase padre
        this.sueldoBase = sueldoBase;
    }

    //Implementamos sueldo fijo
    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}
