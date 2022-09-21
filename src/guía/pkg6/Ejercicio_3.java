/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scan.nextLine();
        System.out.println("En mayúscula: " + frase.toUpperCase());
        System.out.println("En minúscula: " + frase.toLowerCase());
    }
}
