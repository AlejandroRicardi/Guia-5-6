/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
 */
package guía.pkg6;

import java.util.Scanner;

public class Ejercicio__12 {

    public static void main(String[] args) {
        String frases;
        Scanner scan = new Scanner(System.in);
        System.out.println("Iniciando...");
        System.out.println("");
        do {
            System.out.println("Ingrese una frase:");
            frases = scan.nextLine();
        } while (frases.length() <= 5 && (frases.charAt(0) == 'x' || frases.charAt(0) == 'X') && (frases.charAt(frases.length() - 1) == 'o' || frases.charAt(frases.length() - 1) == 'O'));
        System.out.println("");
        System.out.println("Finalizando...");
    }
}
