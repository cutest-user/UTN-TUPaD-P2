
package tp5ej2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;//Agregacion unidireccional
    private Usuario usuario;//Asociacion bidireccional

    //Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        this.usuario.setCelular(this);//se genera asociacion
        
    }

    @Override
    public String toString() {
        return "Celular: imei:" + imei + ", marca:" + marca + ", modelo:" + modelo + ", bateria:" + bateria + ", usuario: " + usuario;
    }
}
