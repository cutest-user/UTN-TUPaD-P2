//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej13;

public class CodigoQR {
    private String valor;
    private Usuario usuario;//Asociacion unidireccional

    //constructor
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CódigoQR: " + valor + " - " + usuario;
    }
}