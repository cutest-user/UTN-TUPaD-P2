
package tp5ej5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;//Composicion
    private Propietario propietario;//Asociacion bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); //Composicipn
        this.propietario = propietario; //Asociacion bidireccional
    }


    @Override
    public String toString() {
        return "Computadora marca:" + marca + ", numeroSerie:" + numeroSerie + ", Placa madre: " + placaMadre + ", propietario: " + propietario;
    }
}
