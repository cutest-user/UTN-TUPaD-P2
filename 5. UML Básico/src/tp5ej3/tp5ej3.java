
package tp5ej3;

public class tp5ej3 {

    public static void main(String[] args) {
        //se crea el autor
        Autor autor1 = new Autor("J. R. R. Tolkien", "Britanico");

        //se crea la editorial
        Editorial editorial1 = new Editorial("HarperCollins", "UK");

        //se crea el libro con asociación a autor y agregación a editorial
        Libro libro1 = new Libro("El señor de los anillos", "9123092132", autor1, editorial1);

        //se muestra la información
        System.out.println("Información del libro");
        System.out.println(libro1.toString());
        
    }

}
