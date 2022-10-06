package ppt;

import java.awt.Color;

import javax.swing.*;
// // import java.util.*;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        // ! Pedimos al usuario su nombre
        // String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        // System.out.println("Bienvenido " + nombre + " a Piedra, Papel o Tijera");

        // ^ Declaramos las variables
        JFrame ventana = new JFrame("Piedra, Papel o Tijera");
        ventana.setSize(1200, 720);

        // ? Funcionalidades de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(true);

        // ? Icono
        ImageIcon icono = new ImageIcon("src/ppt/icono.png");
        ventana.setIconImage(icono.getImage());

        // ^ Creamos los botones de piedra papel y tijera
        JButton piedra = new JButton("Piedra");
        JButton papel = new JButton("Papel");
        JButton tijera = new JButton("Tijera");

        // ^ Asignamos el tamaño y la posición de los botones
        piedra.setBounds(10, 10, 100, 50);
        papel.setBounds(120, 10, 100, 50);
        tijera.setBounds(230, 10, 100, 50);

        // ^ Cambiamos el color de los botones
        piedra.setBackground(Color.RED);
        papel.setBackground(Color.YELLOW);
        tijera.setBackground(Color.GREEN);

        // ^ Añadimos los botones a la ventana
        ventana.add(piedra);
        ventana.add(papel);
        ventana.add(tijera);

        // ! Hacemos la ventana visible
        ventana.setVisible(true);
    }
}
