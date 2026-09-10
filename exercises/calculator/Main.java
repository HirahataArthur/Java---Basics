package calculator;
import java.awt.*;
import java.text.DecimalFormat; // Provides readable formatting for decimal results.
import javax.swing.*;


public class Main{
    public static void main(String[] args){
        JFrame jFrame = new JFrame("--Calculator--");
        jFrame.setLayout(new BorderLayout()); // Splits the window into top, center, and bottom areas.
        jFrame.setSize(500, 500);

        JPanel controls = new JPanel(new FlowLayout()); // Keeps the input controls arranged in one row.
        controls.add(new JLabel("Insert any number: ")); // Adds the input prompt to the controls panel.
        JTextField numberinput = new JTextField(5);
        controls.add(numberinput); // Adds the text field to the controls panel.

        JButton calculate = new JButton("Calculate");
        controls.add(calculate); // Adds the calculate button to the controls panel.
        jFrame.add(controls, BorderLayout.NORTH); // Places the controls at the top of the window.

        JLabel results = new JLabel("<html></html>");
        results.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10)); // Adds space around the results.
        jFrame.add(results, BorderLayout.SOUTH); // Places the results at the bottom of the window.

        DecimalFormat formatter = new DecimalFormat("0.##"); // Shows up to two decimal places without unnecessary zeros.

        calculate.addActionListener((event -> {
            try{
                double n1 = Double.parseDouble(numberinput.getText());
                double remains = n1 % 2;
                double cubed = Math.pow(n1, 3);
                double sqrt = Math.sqrt(n1);
                double cbrt = Math.cbrt(n1);
                double abs = Math.abs(n1);
                results.setText("<html>Results:" +
                        "<br>Remainder of division by 2: " + formatter.format(remains) // Formats the remainder.
                        + "<br>Cubed: " + formatter.format(cubed) + // Formats the cubed value.
                        "<br>Square root: " + formatter.format(sqrt) + // Formats the square root.
                        "<br>Cube root: " + formatter.format(cbrt) + // Formats the cube root.
                        "<br>Absolute value: " + formatter.format(abs) + // Formats the absolute value.
                        "</html>");
            } catch (NumberFormatException e) {
                results.setText("Enter valid numbers");
            }
        }));

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}