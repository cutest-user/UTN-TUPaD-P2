//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej14;

public class EditorVideo {

    //Dependencia de creacion
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); //se crea el render
        System.out.println("Exportación realizada: " + render);
    }
}