/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese grados Centígrados para convertirlos a Fahrenheit:");
        int grados_centigrados = scan.nextInt();
        int grados_fahrenheit = 32 + (9 * grados_centigrados / 5);
        System.out.println("Grados Centígrados: " + grados_centigrados + "° = Grados Fahrenheit: " + grados_fahrenheit + "°");
    }
}
