//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej8;

public class tp5ej8 {

   
    public static void main(String[] args) {
        //se crea el usuario
        Usuario usuario1 = new Usuario("Jorge Fulano", "Jorge@gmail.com");

        //se crea el documento (composición con firma digital)
        Documento documento1 = new Documento("Contrato 123", "Condiciones empleado","AB5323", "9/2/25", usuario1);

        //se muestra la informacion completa
        System.out.println("Datos del documento");
        System.out.println(documento1);
    }

}
