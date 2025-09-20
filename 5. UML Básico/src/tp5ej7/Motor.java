//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej7;

public class Motor {
    private String tipo;
    private String numeroSerie;

    //Constructor
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor tipo:" + tipo + ", numeroSerie:" + numeroSerie;
    }
}
