//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej9;


public class tp5ej9 {


    public static void main(String[] args) {
        //se crea el paciente
        Paciente paciente1 = new Paciente("Jorge Fulano", "Swiss");

        //se crea el profesional
        Profesional profesional1 = new Profesional("Dr. Gomez", "Cirugia");

        //se crea la cita medica
        CitaMedica cita1 = new CitaMedica("01/10/24", "8:15", paciente1, profesional1);

        //se muestra la informacion completa
        System.out.println("Datos de la cita medica");
        System.out.println(cita1);
        
    }

}
