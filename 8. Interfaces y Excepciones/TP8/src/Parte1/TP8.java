
/*
PROGRAMACION II
ALUMNO: LEPKA AGUSTIN
COMISION: 13
 */
package Parte1;

public class TP8 {

    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Agustin");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Heladera", 600000));
        pedido.agregarProducto(new Producto("Microondas", 50000));

        double total = pedido.calcularTotal();
        System.out.println("Total sin descuento: $" + total);

        TarjetaCredito tc = new TarjetaCredito();
        PayPal paypal = new PayPal();

        //Pago con tarjeta con descuento
        double totalDescuento = tc.aplicarDescuento(total);
        tc.procesarPago(totalDescuento);

        //Cambio de estado del pedido
        pedido.cambiarEstado("Preparando envio");

        //Pago con PayPal
        paypal.procesarPago(total);
    }

}
