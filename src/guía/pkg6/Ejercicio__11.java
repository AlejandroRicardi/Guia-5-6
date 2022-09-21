/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio__11 {

    public static void main(String[] args) {
        int num1, num2, posicion;
        String salida = null;
        Scanner scan = new Scanner(System.in);
        
        do {            
            System.out.println("Ingrese un número ENTERO:");
            num1 = scan.nextInt();
        } while (num1 < 0);

        do {            
            System.out.println("Ingrese otro número ENTERO:");
            num2 = scan.nextInt();
        } while (num2 < 0);

        do {
            System.out.println("");
            System.out.println("MENÚ\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nElija opción:");
            posicion = scan.nextInt();
            switch (posicion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La suma es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La suma es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?:");
                    salida = scan.nextLine();
                    if (salida.equals("S") || salida.equals("s")) {
                        System.out.println("Saliendo...");
                        break;
                    }
                default:
                    throw new AssertionError();
            }
        } while (posicion != 5);
    }
}
