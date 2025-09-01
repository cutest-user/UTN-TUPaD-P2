
package tp3programacionii;

//TP 3 INTRODUCCION A POO
//Alumno: LEPKA AGUSTIN
//Comision: 13

public class Principal {


    public static void main(String[] args) {
        
        //Objeto ESTUDIANTE
        Estudiante estudiante1 = new Estudiante();
        
        //se establecen sus atributos
        estudiante1.setNombre("Juan");
        estudiante1.setApellido("Lopez");
        estudiante1.setCurso("Ultimo");
        estudiante1.setCalificacion(7.5);
        
        //se muestra el estado con los datos iniciales
        estudiante1.mostrarInformacion();
       
        //se aumenta la calificacion 2 puntos
        estudiante1.subirCalificacion(2);
        
        //se muestra el estado con la calificacion aumentada en 2
        estudiante1.mostrarInformacion();
        
        //se baja 5 puntos la calificacion
        estudiante1.bajarCalificacion(5);
        
        //se muestra el estado final del objeto
        estudiante1.mostrarInformacion();
       
        //_________________________________
        
        //Objeto MASCOTA
        
        Mascota mascota1 = new Mascota();
        
        //se establecen sus atributos
        mascota1.setNombre("Firulais");
        mascota1.setEspecie("Bulldog");
        mascota1.setEdad(3);
        
        //se muestra el estado inicial de la mascota
        mascota1.mostrarInfo();
        //se aumenta la edad de la mascota en 1
        mascota1.cumplirAnios();
        //se muestra el estado final de la mascota
        mascota1.mostrarInfo();

        //_________________________________
        
        
        //objeto Libro
        Libro libro1 = new Libro();
        //se establecen los valores de los atributos para el libro
        libro1.setTitulo("Principito");
        libro1.setAutor("Antoine");
        libro1.setAñoPublicacion(1943);
        //se muestran los datos iniciales del libro
        libro1.mostrarInfo();
              
        //se intenta modificar el anio del libro con valor erroneo
        libro1.setAñoPublicacion(0);
        
        //se modifica a un anio correcto
        libro1.setAñoPublicacion(1943);
        
        //se muestran los datos finales del libro
        libro1.mostrarInfo();
        //se utilizan los getters para mostrar datos individualmente
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getAñoPublicacion());
        System.out.println(libro1.getTitulo());              
        
        //_________________________________
        
        
        //Objeto GALLINA
        Gallina gallinita1 = new Gallina();
        //se establecen los valores para el objeto gallina
        gallinita1.setIdGallina(190);
        gallinita1.setEdad(2);
        //se suma cantidad de huevos puestos
        gallinita1.ponerHuevo();
        //se muestra el estado de la gallina
        gallinita1.mostrarEstado();
        //se aumenta la edad en 1
        gallinita1.envejecer();
        //se aumenta los huevos puestos en 1
        gallinita1.ponerHuevo();
        //se muestran los datos finales del objeto
        gallinita1.mostrarEstado();
        
        //_________________________________
        
        
        //Objeto Nave Espacial
        NaveEspacial naveEspacial1 = new NaveEspacial();
        //se establecen los valores para el objeto nave espacial
        naveEspacial1.setNombre("Nave Principal");
        naveEspacial1.setCombustible(30);
        //se muestra el estado inicial de la nave
        naveEspacial1.mostrarEstado();
        //se intenta que la nave avance
        naveEspacial1.avanzar(20);
        //se carga combustible
        naveEspacial1.recargarCombustible(50);
        //mediante getter se muestra el dato de la cantidad de combustible     
        naveEspacial1.getCombustible();
        //se intenta que la nave avance nuevamente
        naveEspacial1.avanzar(20);
        
        //se muestra el estado de la nave
        naveEspacial1.mostrarEstado();
     
    }

}
