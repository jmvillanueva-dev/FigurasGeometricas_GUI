import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JLabel mainTitle;
    private JLabel titleCircle;
    private JTextField inputValueRadio;
    private JButton calcularButton;
    private JLabel labelRadio;
    public JPanel mainPanel;
    private JLabel resultArea;
    private JLabel resultPerimeter;

    public MainForm() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double area = 0, perimeter = 0;
                double radius = Double.parseDouble(inputValueRadio.getText());
                area = Math.PI * radius * radius;
                perimeter = 2 * Math.PI * radius;
                resultArea.setText(String.format("Área: %.2f", area));
                resultPerimeter.setText(String.format("Perímetro: %.2f", perimeter));
            }
        });
    }
}
