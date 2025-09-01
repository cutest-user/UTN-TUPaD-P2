
package tp3programacionii;

public class Estudiante {
    
    //atributos para el objeto
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    //setters
    //asignar nombre
    public void setNombre(String nuevoNombre) { 
        nombre = nuevoNombre; 
    }
    //asignar apellido
    public void setApellido(String nuevoApellido) { 
        apellido = nuevoApellido;
    }
    //asignar curso
    public void setCurso(String nuevoCurso) { 
        curso = nuevoCurso; 
    }
    //asignar calificacion
    public void setCalificacion(double aumentarCalificacion) { 
        calificacion = aumentarCalificacion; 
    }
        
    //metodos
    //mostrar informacion del objeto
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + "\n" + apellido + "\n" + "Curso: " + curso + "\n" + "Calificacion: " + calificacion);
    }

    //subir calificacion
    public void subirCalificacion(double puntos) { calificacion = calificacion + puntos; }
    
    //bajar calificacion
    public void bajarCalificacion(double puntos) { 
        calificacion = calificacion - puntos; 
        if (calificacion < 0) calificacion = 0; 
    }
}