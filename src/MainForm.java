import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public JPanel mainPanel;
    private JLabel mainTitle;
    private JLabel titleCircle;
    private JTextField inputField1;
    private JButton calculateCircleButton;
    private JLabel labelText1;
    private JLabel resultLabel;
    private JTextField inputField2;
    private JButton calculateSquareButton;
    private JButton calculateRectangleButton;
    private JButton calculateTriangleButton;
    private JButton calculatePentagonButton;
    private JLabel labelText2;
    private JButton clearButton;

    public MainForm() {
        calculateCircleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(inputField1.getText());
                    double area = Math.PI * radius * radius;
                    double perimeter = 2 * Math.PI * radius;
                    resultLabel.setText(String.format("Área: %.2f | Perímetro: %.2f", area, perimeter));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingresa un valor numérico válido para el radio.");
                }
            }
        });

        calculateSquareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double side = Double.parseDouble(inputField1.getText());
                    double area = side * side;
                    double perimeter = 4 * side;
                    resultLabel.setText(String.format("Área: %.2f | Perímetro: %.2f", area, perimeter));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingresa un valor numérico válido para el lado.");
                }
            }
        });

        calculateRectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(inputField1.getText());
                    double width = Double.parseDouble(inputField2.getText());
                    double area = length * width;
                    double perimeter = 2 * (length + width);
                    resultLabel.setText(String.format("Área: %.2f | Perímetro: %.2f", area, perimeter));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingresa valores numéricos válidos para la base y la altura.");
                }
            }
        });

        calculateTriangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(inputField1.getText());
                    double height = Double.parseDouble(inputField2.getText());
                    double area = 0.5 * base * height;
                    double perimeter = base + 2 * Math.sqrt((base / 2) * (base / 2) + height * height);
                    resultLabel.setText(String.format("Área: %.2f | Perímetro: %.2f", area, perimeter));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingresa valores numéricos válidos para la base y la altura.");
                }
            }
        });

        calculatePentagonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double side = Double.parseDouble(inputField1.getText());
                    double perimeter = 5 * side;
                    double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
                    resultLabel.setText(String.format("Área: %.2f | Perímetro: %.2f", area, perimeter));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingresa un valor numérico válido para el lado.");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField1.setText("");
                inputField2.setText("");
                resultLabel.setText(">>> Resultado <<<");
            }
        });
    }
}
