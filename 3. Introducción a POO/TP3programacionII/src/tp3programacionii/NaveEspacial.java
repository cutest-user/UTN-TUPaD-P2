
package tp3programacionii;

public class NaveEspacial {
    //se establecen atributos para la nave
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;

    //setters
    //establecer nombre de la nave
    public void setNombre(String nuevoNombre) { 
        nombre = nuevoNombre; 
    }
    //establecer cantidad de combustible
    public void setCombustible(int nuevaCantidad) { 
        combustible = nuevaCantidad;
    }
    
    //getter para la cantidad de combustible
    public void getCombustible(){
        System.out.println("la cantidad de combustible actual es: " + combustible);
    }
    
    //metodos
    
    //simular el despegue de la nave
    public void despegar() {
        if (combustible >= 10) {
            combustible = combustible - 10;
            System.out.println("La nave " + nombre + " ya despego" + "\n" + "Combustible restante: " + combustible);
            
        } 
        else {
            System.out.println("No alcanza el combustible para despegar.");
        }
        
    }
    
    //simular el avance de la nave
    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible = combustible - consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades." + "\n" + "Combustible restante: " + combustible);
        } 
        else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
            
    }

    //simular carga de combustible de la nave
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible = combustible + cantidad;
            System.out.println("Se recargo " + cantidad + " unidades." +"\n" + "Combustible actual: " + combustible);
        } 
        else {
            System.out.println("No se puede recargar, supera el límite de " + LIMITE_COMBUSTIBLE);
        }
    }
    
    //muestra el estado de la nave
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + "\n" + "Combustible: " + combustible + "\n" + "Limibte de combustible: " + LIMITE_COMBUSTIBLE);
                
    }
}
