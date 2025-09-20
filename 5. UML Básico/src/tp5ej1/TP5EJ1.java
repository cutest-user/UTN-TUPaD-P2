
//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13

package tp5ej1;

public class TP5EJ1 {

    
    public static void main(String[] args) {
      
        //se crea al titular
        Titular titular = new Titular("Pepe", "44786434");
        //se crea la foto del titular
        Foto foto = new Foto("imagenTitular.jpg", "JPG");
        //se crea el pasaporte, con foto y titular
        Pasaporte pasaporte = new Pasaporte("AR4747", "01/01/2025", "imagenTitular.jpg", ".jpg", titular);
        //se imprimen los datos
        System.out.println(pasaporte);
        System.out.println("El titular del pasaporte: " + titular.getPasaporte());
        
        
    }

}
