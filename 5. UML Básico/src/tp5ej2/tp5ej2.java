
package tp5ej2;

public class tp5ej2 {
   
    public static void main(String[] args) {
        
        //se crea un usuario
        Usuario usuario1 = new Usuario("Perez Fulano", "12345678");
        //Se crea una bateria
        Bateria bateria1 = new Bateria("Li-Ion", 5000);
        //se crea un celular con la bateria
        Celular celular1 = new Celular("32543243", "Samsung", "Galaxy S24 ULTRA", bateria1, usuario1);

        //se imprime la informacion
        System.out.println(celular1);
        System.out.println("El usuario del celular: " + usuario1.getCelular());
    }
}

