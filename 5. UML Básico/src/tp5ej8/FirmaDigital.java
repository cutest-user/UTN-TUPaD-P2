
package tp5ej8;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; //Agregacion
    

    //Constructor
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital codigoHash:" + codigoHash + ", fecha:" + fecha +  " Usuario: " + usuario;
    }
}
