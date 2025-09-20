
package tp5ej1;


public class Foto {
    
    //Atributos
    private String imagen;
    private String formato;

    //Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    //getters
    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Foto imagen:" + imagen + ", formato:" + formato;
    }

}
