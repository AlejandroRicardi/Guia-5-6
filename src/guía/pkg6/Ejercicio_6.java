/*
Crear un programa que dado un numero determine si es par o impar.
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
