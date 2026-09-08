package arithmeticoperators;
import java.awt.*;
import javax.swing.*;


//By declaring a field before adding it, we can later get its info or manipulate it to print something else, like in 'resultLabel'

public class SwingMain{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Division"); //Window name
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500,500);

        jFrame.add(new JLabel("Numerator:")); //Numerator label added
        JTextField numeratorField = new JTextField(10); //Number field declaration
        jFrame.add(numeratorField); //Numerator addition

        jFrame.add(new JLabel("Denominator:")); //Denominator Label added
        JTextField denominatorField = new JTextField(10);  //Number field declaration
        jFrame.add(denominatorField);//Denominator addition

        JButton divideButton = new JButton("Divide"); //Button declaration
        JLabel resultLabel = new JLabel("<html>Result:<br>Remainder of division:</html>");
        jFrame.add(divideButton); // button addition
        jFrame.add(resultLabel); // result label addition


        divideButton.addActionListener(event -> { //function
            try {                                                            //exception handling
                double numerator = Double.parseDouble(numeratorField.getText());
                double denominator = Double.parseDouble(denominatorField.getText());

                if (denominator == 0) {
                    resultLabel.setText("Cannot divide by zero.");
                } else {
                    double division = numerator/denominator;
                    double remain = numerator % denominator;
                    resultLabel.setText(
                            "<html>Result: " + division
                                    + "<br>Remainder of division: " + remain
                                    + "</html>"
                    );
                }
            } catch (NumberFormatException exception) {
                resultLabel.setText("Enter valid numbers.");
            }
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}