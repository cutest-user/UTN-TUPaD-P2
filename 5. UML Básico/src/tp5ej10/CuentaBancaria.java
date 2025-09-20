//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; //composicipn
    private Titular titular;//Asociacion bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaModificacion); //Composicion
        this.claveSeguridad.setCuentaBancaria(this);
        this.titular = titular; //Asociacipn bidireccional
        this.titular.setCuentaBancaria(this);
    }
    //getter
    public Titular getTitular(){
    return titular;
    }
    public ClaveSeguridad getClaveSeguridad(){
    return claveSeguridad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria cbu:" + cbu + ", saldo:" + saldo + ", clave: " + claveSeguridad +"Titular: " + titular;
    }
}

