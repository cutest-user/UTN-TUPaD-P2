//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej13;

public class tp5ej13 {

    public static void main(String[] args) {
        //creacion del usuario
        Usuario usuario = new Usuario("Jorge", "Jorge@gmail.com");

        //creacion del generador de QR
        GeneradorQR generador = new GeneradorQR();
        //inicio del generador
        generador.generar("AW12321X", usuario); //Dependencia de creacion
        
        
    }

}
