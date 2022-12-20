package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

// ? Importamos la clase Calendar
import java.util.Calendar;

public class CronometroDif {
    public static void main(String[] args) {
        // ^ Definimos las variables horaInicio, minutoInicio, segundoInicio, horaFin, minutoFin y segundoFin todas como final y byte
        final byte horaInicio;
        final byte minutoInicio;
        final byte segundoInicio;
        final byte horaFin;
        final byte minutoFin;
        final byte segundoFin;

        // ^ Definimos las variables tiempo que ha tardado tanto para las horas, minutos y segundos como byte
        byte horas = 0;
        byte minutos = 0;
        byte segundos = 0;

        // ^ Definimos la variable max como long
        long max;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos hasta que hora contar al usuario
        System.out.print("Introduce hasta que numero contar: ");
        max = read.nextLong(); // * Leemos max

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de línea triple
        System.out.println("\n----------------------------------\n");

        // ! Actualizamos la horaInicio, minutoInicio y segundoInicio con el tiempo actual
        horaInicio = (byte) Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        minutoInicio = (byte) Calendar.getInstance().get(Calendar.MINUTE);
        segundoInicio = (byte) Calendar.getInstance().get(Calendar.SECOND);

        // ! Contamos hasta el numero introducido por el usuario mediante un bucle for
        for (long i = 1; i<= max; i++) {
            if(i % 100000000 == 0) {
                System.out.println("Llevo " + i + " numeros contados");
            }
        }

        // ? Salto de línea triple
        System.out.println("\n----------------------------------\n");

        // ! Actualizamos la horaFin, minutoFin y segundoFin con el tiempo actual
        horaFin = (byte) Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        minutoFin = (byte) Calendar.getInstance().get(Calendar.MINUTE);
        segundoFin = (byte) Calendar.getInstance().get(Calendar.SECOND);

        // ! Mediante 3 bucles for calculamos cuanto tiempo ha tardado
        for (byte i = horaInicio; i < horaFin; i++) {
            horas++;
        } for (byte i = minutoInicio; i < minutoFin; i++) {
            minutos++;
        } for (byte i = segundoInicio; i < segundoFin; i++) {
            segundos++;
        }
        
        // ! Imprimimos que ha acabado y la hora de inicio y de fin
        System.out.println("Ha acabado");
        System.out.println("Tiempo que ha tardado > " + horas + ":" + minutos + ":" + segundos);
    }
}
