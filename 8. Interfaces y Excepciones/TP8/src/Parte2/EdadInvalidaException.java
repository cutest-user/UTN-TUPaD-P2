/*
PROGRAMACION II
ALUMNO: LEPKA AGUSTIN
COMISION: 13
 */
package Parte2;

//Excepcion personalizada que extiende Exception
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
