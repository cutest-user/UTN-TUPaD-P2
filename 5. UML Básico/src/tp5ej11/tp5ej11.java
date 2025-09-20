//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej11;


public class tp5ej11 {

    public static void main(String[] args) {

        //se crea el artista
        Artista artista = new Artista("Shakira", "Pop");
        //se crea la cancion
        Cancion cancion = new Cancion("Hips Don't Lie", artista);
        //se crea el reproductoir
        Reproductor reproductor = new Reproductor();
        
        //ejecucion del reproductor
        reproductor.reproducir(cancion); //Dependencia de uso
    }

}
