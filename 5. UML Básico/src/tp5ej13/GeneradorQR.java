
package tp5ej13;

public class GeneradorQR {

    //Dependencia de creacion, se crea un CodigoQR dentro del metodo
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); //se crea el generador
        System.out.println("Generado: " + qr);
    }
}