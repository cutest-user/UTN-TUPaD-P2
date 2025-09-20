
package tp5ej7;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; //Agregacion
    private Conductor conductor;//Asociacion bidireccional

    //constructor
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        this.conductor.setVehiculo(this);
    }

    //getter
    public Conductor getConductor(){
    return conductor;
    }
    @Override
    public String toString() {
        return "Vehículo patente:" + patente + ", modelo:" + modelo + ", Motor: "+ motor + ", Conductor: " + conductor;
    }
}

