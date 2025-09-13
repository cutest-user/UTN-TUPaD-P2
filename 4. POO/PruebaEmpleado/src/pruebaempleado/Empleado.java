
package pruebaempleado;

//PROGRAMACION II
//ALUMNO: LEPKA AGUSTIN


public class Empleado {

     //atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    //atributo static con contador
    private static int totalEmpleados = 0;

    //constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id; 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; //incremento del contador
    }

    //constructor sobrecargado (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; //id generado automatico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; //salario default
        totalEmpleados++;//incremento del contador
    }

    //sobrecarga de metodos para actualizar salario

    //aumento de salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        
        this.salario += this.salario * porcentaje / 100.0;
    }

    //aumento de salario por cantidad fija
    public void actualizarSalario(double cantidad, boolean esFijo) {
        if (esFijo) {
            
            this.salario += cantidad;
        } 
        
        else 
        
        {
            actualizarSalario(cantidad);//llama al aumento por porcentaje si es false
        }
    }

    //getters y setters
    
    //devuelve el id
    public int getId() {
        
        return id;
    }

    //devuelve el nombre
    public String getNombre() {
        
        return nombre;
    }

    
    //establece el nombre
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    //devuelve el puesto
    public String getPuesto() {
        
        return puesto;
    }

    //establece el puesto
    public void setPuesto(String puesto) {
        
        this.puesto = puesto;
    }

    //devuelve el salario
    public double getSalario() {
        
        return salario;
    }
    
    //establece el salario
    public void setSalario(double salario) {
        
        this.salario = salario;
    }

    //toString sobreescrito
    @Override
    public String toString() {
        return "Empleado {id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "}";
    }

    //metodo static que devuelve la cantidad de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    
}
