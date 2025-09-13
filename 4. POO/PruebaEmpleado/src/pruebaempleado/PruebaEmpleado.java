
package pruebaempleado;

//PROGRAMACION II
//ALUMNO: LEPKA AGUSTIN.

public class PruebaEmpleado {


    public static void main(String[] args) {
       
           
        //se crean los empleados con ambos constructores
        Empleado empleado1 = new Empleado(509, "Perez", "Analista", 70000);
        Empleado empleado2 = new Empleado("Lopez", "Programador"); //id automático y salario por defecto
        Empleado empleado3 = new Empleado("Diaz", "Diseñadora");

        //se llama los metodos para actualizar salario
        empleado1.actualizarSalario(25);  //aumento del 25%
        empleado2.actualizarSalario(5000, true);  //aumento de 100 000 fijo
        empleado3.actualizarSalario(7); //aumento del 7%

        //se muestra la informacion de cada objeto
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        //se imprime la cantidad total de empleados
        System.out.println("El total de empleados es: " + Empleado.mostrarTotalEmpleados());
        
        
        
        
    }

}

        