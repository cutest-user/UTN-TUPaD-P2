//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; //Asociacion unidireccional

    //constructor
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
 
    //getter
    public double getMonto(){
    return monto;
    
    }
    @Override
    public String toString() {
        return "Impuesto: $" + monto + " - " + contribuyente;
    }
}