
package tp5ej7;

public class tp5ej7 {

    public static void main(String[] args) {
        //se crea al conductor
        Conductor conductor1 = new Conductor("Jorge Fulano", "L-123123");

        //se crea el motor
        Motor motor1 = new Motor("V4", "SN6234");

        //se crea el vehiculo (agregaciin con motor y asociacion bidireccional con conductor)
        Vehiculo vehiculo1 = new Vehiculo("AD1234WF", "Fiat 600", motor1, conductor1);

        //se muestra la informacion completa
        System.out.println(conductor1.getVehiculo());
        System.out.println(vehiculo1.getConductor());
        
    }

}
