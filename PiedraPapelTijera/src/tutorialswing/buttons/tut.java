package tutorialswing.buttons;

// ? Importamos Swing
import javax.swing.*;

public class tut {
    public static void main(String[] args) {
        JFrame v = new JFrame("Tutorial Swing");
        v.setSize(400, 400);
        v.setResizable(true);
        v.setLayout(null);

        JButton b = new JButton("Hola");
        b.setBounds(5, 5, 100, 100);
        b.setIcon(new ImageIcon(new ImageIcon("src/tutorialswing/buttons/img/imagen.png").getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)));

        v.add(b);
        v.setVisible(true);

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
