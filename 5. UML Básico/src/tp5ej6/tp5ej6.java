//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej6;

public class tp5ej6 {


    public static void main(String[] args) {
        //se crea al cliente
        Cliente cliente1 = new Cliente("Jorge lopez", "3242342");

        //se crea la mesa
        Mesa mesa1 = new Mesa(5, 4);

        //se crea la reserva (asociacion unidireccional con cliente y agregacion con mesa)
        Reserva reserva1 = new Reserva("10/5/25", "22:35", cliente1, mesa1);

        //se muestra la informacion completa
        System.out.println("Datos de la reserva");
        System.out.println(reserva1);
        
    }

}
