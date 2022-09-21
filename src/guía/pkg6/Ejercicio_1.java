/* 
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
              
        System.out.println("Ingrese un número a sumar:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número a sumar:");
        num2 = leer.nextInt();
        suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);
    }
}
