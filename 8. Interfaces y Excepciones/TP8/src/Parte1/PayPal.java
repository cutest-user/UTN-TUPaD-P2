/*
PROGRAMACION II
ALUMNO: LEPKA AGUSTIN
COMISION: 13
 */
package Parte1;

//PayPal solo realiza pagos, no tiene descuento
public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago vía PayPal realizado. Monto: $" + monto);
    }
}
