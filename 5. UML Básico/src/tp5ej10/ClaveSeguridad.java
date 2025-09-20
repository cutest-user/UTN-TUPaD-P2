
package tp5ej10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    private CuentaBancaria cbu;

    //constructor
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    //setter
    public void setCuentaBancaria(CuentaBancaria cbu){
    this.cbu = cbu;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad codigo:" + codigo + ", ultimaModificacion:" + ultimaModificacion;
    }
}
