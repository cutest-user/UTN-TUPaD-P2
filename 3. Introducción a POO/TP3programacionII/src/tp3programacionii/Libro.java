
package tp3programacionii;

public class Libro {
    
    //se establecen atributos para el libro
    private String titulo;
    private String autor;
    private int añoPublicacion;

    //setters
    //asignar titulo
    public void setTitulo(String nuevoTitulo) { 
        titulo = nuevoTitulo;
    }
    //asignar autor
    public void setAutor(String nuevoAutor) { 
        autor = nuevoAutor; 
    }
    //asignar año de publicacion
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025){
            añoPublicacion = año;
        }
        else {
            System.out.println("Año inválido: " + año);
        }
    }
    
    //getters
    //devolver titulo
    public String getTitulo() { 
        return titulo;
    }
    //devolver autor
    public String getAutor() { 
        return autor; 
    }
    //devolver año de publicacion
    public int getAñoPublicacion() { 
        return añoPublicacion;
    }
    
    //se muestra toda la informacion del objeto
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + "\n"+ "Autor: " + autor +  "\n"+ "Año: " + añoPublicacion);
    }
    
    
}
