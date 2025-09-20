//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej5;


public class tp5ej5 {


    public static void main(String[] args) {
        //se crea al propietario
        Propietario propietario1 = new Propietario("Agustín Pérez", "13542334");

        //se crea la computadora (composicion con placa madre)
        Computadora computadora1 = new Computadora("ASUS", "SN235423", "ASUS ROG", "Z790", propietario1);

        //se muestra la informacion completa
        System.out.println("Datos de la computadora");
        System.out.println(computadora1.toString());
    }

}
