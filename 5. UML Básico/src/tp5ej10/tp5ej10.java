//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej10;

public class tp5ej10 {

    public static void main(String[] args) {
        //se crea al titular
        Titular titular1 = new Titular("Jorge Fulano", "132423");
        //se crea la cuenta bancaaria
        CuentaBancaria cuenta1 = new CuentaBancaria("1234243243243234243", 10350, "PASSWORD", "01/02/25", titular1);
        
        //se imprimen los datos
        System.out.println("Datos de la cuenta bancaria");
        System.out.println(cuenta1);
        
    }

}
