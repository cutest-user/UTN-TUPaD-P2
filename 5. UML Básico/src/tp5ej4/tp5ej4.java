
package tp5ej4;

public class tp5ej4 {

    public static void main(String[] args) {
        //se crea el banco
        Banco banco1 = new Banco("Banco Nacion", "23-12345678-5");

        //se crea el cliente
        Cliente cliente1 = new Cliente("Jorge perez", "1332234");

        //se crea tarjeta con el banco
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1266-5458-9322-3322", "12/27", banco1);

        //se asocia la tarjeta al cliente (bidireccional)
        cliente1.setTarjeta(tarjeta1);

        //se muestra la información de la tarjeta
        System.out.println("Datos de la tarjeta");
        System.out.println(tarjeta1.getDatosTarjeta());
    }

}
