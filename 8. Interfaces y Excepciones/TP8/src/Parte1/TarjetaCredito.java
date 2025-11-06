/*
PROGRAMACION II
ALUMNO: LEPKA AGUSTIN
COMISION: 13
 */
package Parte1;

//Implementa Pago y PagoConDescuento porque puede pagar y tener descuento
public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta realizado. Monto final: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; //10% de descuento
    }
}
