
package tp5ej11;

public class Cancion {
    private String titulo;
    private Artista artista;//Asociacion unidireccional

    //constructor
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Canción: " + titulo + " artista: " + artista;
    }
}