
package tp3programacionii;

public class Mascota {
    
    //atributos para la mascota
    private String nombre;
    private String especie;
    private int edad;
    
    //setters
    //asignar nombre
    public void setNombre(String nuevoNombre) { 
        nombre = nuevoNombre; 
    }
    //asignar especie
    public void setEspecie(String nuevaEspecie) { 
        especie = nuevaEspecie;
    }
    //asignar edad
    public void setEdad(int nuevaEdad) { 
        edad = nuevaEdad; 
    }

    //metodos
    
    //mostrar informacion del estado del objeto
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + "\n" + "Especie: " + especie + "\n" + "Edad: " + edad + " años");
    }
    
    //aumentar edad de la mascota
    public void cumplirAnios() { edad++; }
}