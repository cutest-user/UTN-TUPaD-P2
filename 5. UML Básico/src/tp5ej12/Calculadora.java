
package tp5ej12;

public class Calculadora {

    //Dependencia de uso, recibe Impuesto como parametro y no lo guarda
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto: " + impuesto);
        // Ejemplo de cálculo (simple)
        double total = impuesto.getMonto() * 1.21; //ejemplo con el IVA del 21%
        System.out.println("Monto total con impuesto: $" + total);
    }
}