package progressbar;

public class ProgressBar {
    public static void main(String[] args) throws InterruptedException {
        // ^ Creamos el RNG

        // ? Barra de Progreso
        System.out.print("(----------) / 0% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(#---------) / 10% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(##--------) / 20% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(###-------) / 30% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(####------) / 40% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(#####-----) / 50% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(######----) / 60% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(#######---) / 70% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(########--) / 80% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(#########-) / 90% \r");
        Thread.sleep((int) (Math.random() * 1000 + 1));

        System.out.print("(##########) / 100%");

        
    }
}
