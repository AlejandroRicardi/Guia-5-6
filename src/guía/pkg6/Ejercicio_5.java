/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guía.pkg6;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num = scan.nextInt();
        System.out.println("El doble es: " + num * 2);
        System.out.println("El triple es: " + num * 3);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(num));
    }
}
