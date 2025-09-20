
package tp5ej14;

public class Render {
    private String formato;
    private Proyecto proyecto; //Asociacion unidireccional

    //COnstructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render en formato " + formato + " del " + proyecto;
    }
}