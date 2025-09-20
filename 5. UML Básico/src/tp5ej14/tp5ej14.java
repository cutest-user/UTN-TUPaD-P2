//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej14;


public class tp5ej14 {


    public static void main(String[] args) {
     
        //creacion del proyecto
        Proyecto proyecto = new Proyecto("Corto Animado", 15);

        //creacion del editor
        EditorVideo editor = new EditorVideo();
        //ejecuciones de las exportaciones
        editor.exportar("MP4", proyecto);
        editor.exportar("AVI", proyecto);
    }

}
