
package tp3programacionii;

public class Gallina {
    //se establecen atributos para objeto de clase gallina
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    //se establecen los setters
    //asignar numero de identificacion de la gallina
    public void setIdGallina(int id) { 
        idGallina = id; 
    }
    //asignar la edad de la gallina
    public void setEdad(int nuevaEdad) { 
        edad = nuevaEdad;
    }
    //metodos
    //simula poner 1 huevo mas de gallina
    public void ponerHuevo() { huevosPuestos++; }
    //simula envejecer 1 anio mas a la gallina
    public void envejecer() { edad++; }
    
    //se muestra la informacion del objeto
    public void mostrarEstado() {
        System.out.println("Gallina id: " + idGallina + "\n" +"Edad: " + edad + "\n" + "Huevos puestos: " + huevosPuestos);
    }

}
