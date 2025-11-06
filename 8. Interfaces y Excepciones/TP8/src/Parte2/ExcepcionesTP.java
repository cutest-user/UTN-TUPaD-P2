
/*
PROGRAMACION II
ALUMNO: LEPKA AGUSTIN
COMISION: 13
 */

package Parte2;
import java.io.*;
import java.util.Scanner;

public class ExcepcionesTP {

   
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        //1. Division segura
        try {
            System.out.print("Ingrese dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero.");
        }

        sc.nextLine(); //limpiar buffer

        //2. Conversion segura
        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: no es un número válido.");
        }

        //3. Lectura de archivo
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            System.out.println("Contenido: " + br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura.");
        }

        //4. Excepción personalizada
        try {
            validarEdad(200); 
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        //5. Try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            System.out.println("Leyendo archivo con try with resources...");
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        }
    }

    //Metodo para validar edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
    }

}
