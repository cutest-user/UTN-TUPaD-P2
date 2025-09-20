//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;//Asociacion unidireccional
    private Editorial editorial;//Agregacion

    //Constructor
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }


    @Override
    public String toString() {
        return "Libro: titulo:" + titulo + ", isbn:" + isbn + ", autor:" + autor + ", editorial:" + editorial;
    }
}
