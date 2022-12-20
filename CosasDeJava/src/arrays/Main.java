package arrays;

// ? Importamos la clase Scanner y Locale
import arrays.Main;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array en la variable listaDeResultados de tipo int
        long[] listaDeResultados = new long[];

        // ^ Creamos un objeto de la clase Scanner en la variable final read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Almacaenamos en el Array todos los numeros desde 1 hasta 10
        for (i = 1; i <= 10; i++){
            for (pos = 0; pos < 10; pos++) {
                listaDeResultados[pos] = i;
            }
        }

        // ! Mostramos el contenido del Array
        for (pos = 0; pos < listaDeResultados.length; pos++)
            System.out.println(listaDeResultados[pos]);
    }
}
