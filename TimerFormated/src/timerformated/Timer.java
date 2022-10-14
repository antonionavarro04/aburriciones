package timerformated;

import java.util.Scanner;
import java.util.Locale;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        // ^ Importamos la clase Version y la Imprimimos
        Version v = new Version();
        System.out.println("V. " + v.release + v.version);

        // ? Salto de Linea Pro
        System.out.println();System.out.println("----------------------------------");System.out.println();

        // ^ Creamos la variable para los segundos, minutos y horas
        byte segundos;
        byte minutos;
        byte horas;

        // ^ Scanner
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los datos
        System.out.print("Introduce los segundos: ");
        segundos = read.nextByte();
        System.out.print("Introduce los minutos: ");
        minutos = read.nextByte();
        System.out.print("Introduce las horas: ");
        horas = read.nextByte();

        System.out.println(horas + ":" + minutos + ":" + segundos);

        // ! Mediante el While hacemos el Timer
        
        while (horas != 0 || minutos != 0 || segundos != 0){
            if (minutos == 0 && horas > 0){
                minutos = 60;
                horas--;
            } if (segundos == 0 && minutos > 0){
                segundos = 59;
                minutos--;
            }
            System.out.println(horas + ":" + minutos + ":" + segundos);

            segundos--;

            Thread.sleep(1000);
        }

        read.close();
        
    }
    
    
}
