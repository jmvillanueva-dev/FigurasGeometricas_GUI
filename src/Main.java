import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estudiante: Jhonny Villanueva M.");

        JFrame frame = new JFrame("Calculadora Geometrica | App Java Swing");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setPreferredSize(new Dimension(800,600));
        frame.pack();
        frame.setVisible(true);

    }
}