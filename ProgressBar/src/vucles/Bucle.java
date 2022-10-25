package vucles;

// ? Importamos Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Bucle {
    public static void main(String[] args) {
        // ? Crearemos un bucle que nos imprima todos los numeros del 0 al 100
        // ^ Declaramos las variables
        byte i = 0;

        // ! Creamos el bucle
        while (i <= 100) {
            System.out.println(i);
            i++;

            try {
                Thread.sleep(100); // ! Añadimos un sleep de 100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
