//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej12;


public class tp5ej12 {


    public static void main(String[] args) {
        //creacion de contribuyente
        Contribuyente contribuyente = new Contribuyente("Jorge", "32-1234232-5");
        //creacion de impuesto
        Impuesto impuesto = new Impuesto(5000.0, contribuyente);
        //creacion mde calculadora
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto); //Dependencia de uso
    }

}
