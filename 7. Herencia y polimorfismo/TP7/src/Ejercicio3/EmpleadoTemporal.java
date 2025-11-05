
package Ejercicio3;

//Empleado temporal que cobra por día trabajado
public class EmpleadoTemporal extends Empleado {

    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(String nombre, int diasTrabajados, double pagoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSueldo() {
        return diasTrabajados * pagoPorDia;
    }

    //metodo exclusivo para acceder días
    public int getDiasTrabajados() {
        return diasTrabajados;
    }
}
