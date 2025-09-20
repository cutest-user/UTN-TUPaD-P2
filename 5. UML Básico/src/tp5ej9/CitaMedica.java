
package tp5ej9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;//Asociacion unidireccional
    private Profesional profesional;//Asociacion unidireccional

    //constructor
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica fecha:" + fecha + ", hora:" + hora + ", paciente: "+ paciente + ", profesional: " +profesional;
    }
}
