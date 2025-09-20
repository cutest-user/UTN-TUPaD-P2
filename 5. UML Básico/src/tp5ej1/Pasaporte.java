//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej1;


public class Pasaporte {

    //Atributos
    private String numero;
    private String fechaEmision;
    private Foto foto; //Composicion y unidireccional, si se borra Pasaporte, tambien Foto. Foto no sabe a que pasaporte pertenece
    private Titular titular; //Asociacion bidireccional

    //Constructor
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
        this.titular.setPasaporte(this);//se genera la asociacion
    }

    @Override
    public String toString() {
        return "Pasaporte numero:" + numero + ", fechaEmision:" + fechaEmision +
               ", " + foto + ", " + titular;
    }
}
