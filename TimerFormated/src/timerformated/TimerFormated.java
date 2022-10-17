package timerformated;

public class TimerFormated {
    public static void main(String[] args) throws InterruptedException {
        // ^ Importamos la clase Version y la Imprimimos
        Version v = new Version();
        System.out.println("V. " + v.release + v.version);

        // ? Salto de Linea Pro
        System.out.println();System.out.println("----------------------------------");System.out.println();

        // ^ Creamos la variable para los segundos, minutos y horas
        byte segundos = 1;
        byte minutos = 0;
        byte horas = 0;

        // ! Mediante el While hacemos el Timer
    
        while (segundos < 60){
            System.out.print(" " + horas + ":" + minutos + ":" + segundos + "\r");
            segundos++;

            if (segundos == 60){
                segundos = 0;
                minutos++;

                if (minutos == 60){
                    minutos = 0;
                    horas++;
                }
            }
            
            Thread.sleep(1000);
            // // System.out.println("\033[H\033[2J");
        }
        
    }
    
    
}
