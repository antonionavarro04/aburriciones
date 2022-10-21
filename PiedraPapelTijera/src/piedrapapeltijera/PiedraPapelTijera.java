package piedrapapeltijera;

// ? Utils y Swing
import javax.swing.*;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        // ^ Variables

        // ^ Importamos la clase Version
        Version v = new Version();

        // ! Version
        System.out.println("Piedra, papel o tijera");
        System.out.println("Versión: " + v.version + v.state);
        
        // ^ Ventana
        JFrame ventana = new JFrame("Piedra, papel o tijera");
        ventana.setSize(400, 400);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // ^ Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // ^ Botones
        JButton piedraB = new JButton("Piedra");
        piedraB.setBounds(10, 10, 100, 30);
        panel.add(piedraB);

        JButton papelB = new JButton("Papel");
        papelB.setBounds(10, 50, 100, 30);
        panel.add(papelB);

        JButton tijeraB = new JButton("Tijera");
        tijeraB.setBounds(10, 90, 100, 30);
        panel.add(tijeraB);

        // ^ Texto
        JTextArea texto = new JTextArea();
        texto.setBounds(10, 130, 150, 50);
        panel.add(texto);
        texto.setEditable(false);

        // ! Añadimos el panel a la ventana
        ventana.add(panel);

        // ! Mostramos la ventana
        ventana.setVisible(true);

        // ! Funcionalidades de los Botones
        piedraB.addActionListener(e -> {
            texto.setText("Has elegido piedra");
        });
        
        papelB.addActionListener(e -> {
            texto.setText("Has elegido papel");
        });

        tijeraB.addActionListener(e -> {
            texto.setText("Has elegido tijera");
        });
    }
}
