//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej5;


public class PlacaMadre {
    private String modelo;
    private String chipset;

    //constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre modelo:" + modelo + ", chipset:" + chipset;
    }
}
