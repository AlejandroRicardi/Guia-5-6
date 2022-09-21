/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = scan.next();
        System.out.println("Tu nombre es " + nombre);
    }
}
