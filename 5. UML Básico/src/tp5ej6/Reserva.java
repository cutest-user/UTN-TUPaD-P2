//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej6;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;//Asociacion unidireccional
    private Mesa mesa;//Agregacion

    //constructor
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva fecha:" + fecha + ", hora:" + hora  + ", cliente: " + cliente + ", mesa:" +mesa;
    }
}
