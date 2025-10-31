/*
PROGRAMACION II - TRABAJO PRACTICO 6

ALUMNO: LEPKA AGUSTIN MARIO NICOLAS
COMISION: 13
*/

package tp6;

public enum CategoriaProducto {
    
    //constantes del enum con su descripcion
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    //atributo privado que guarda la descripcion
    private final String descripcion;

    //constructor del enum
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    //getter
    public String getDescripcion() {
        return descripcion;
    }
}