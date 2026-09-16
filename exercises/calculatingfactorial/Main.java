package calculatingfactorial;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;


public class Main{
    public static void main(String[] args){

        JFrame jframe = new JFrame("Calculating fatorials");
        jframe.setLayout(new BorderLayout(15, 15));
        jframe.getRootPane().setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Added padding around the window contents.


        //TITLE
        JPanel jtitle = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titlelbl = new JLabel("FACTORIAL");
        titlelbl.setFont(new Font("SansSerif", Font.BOLD, 22));
        jtitle.add(titlelbl);

        //BODY
        JPanel controls = new JPanel(new GridLayout(2, 3, 10, 10));
        JLabel instructionlbl = new JLabel("Find out the fatorial of any number!");
        JTextField numbertxt = new JTextField(10);
        JLabel exclamationmark = new JLabel("!");
        JButton calculatebtn = new JButton("Calculate");


        controls.add(instructionlbl);
        controls.add(new JLabel());
        controls.add(new JLabel());
        controls.add(numbertxt);
        controls.add(exclamationmark);
        controls.add(calculatebtn);


        //RESULT
        JPanel resultpn = new JPanel(new BorderLayout());
        JLabel resultlbl = new JLabel(" ", SwingConstants.CENTER);
        resultlbl.setFont(new Font("SansSerif", Font.PLAIN, 14));
        resultpn.setBorder(BorderFactory.createTitledBorder("Result"));
        resultpn.add(resultlbl, BorderLayout.CENTER);

        jframe.add(jtitle, BorderLayout.NORTH);
        jframe.add(controls, BorderLayout.CENTER);
        jframe.add(resultpn, BorderLayout.SOUTH);


        calculatebtn.addActionListener(event -> {
            try {
                int number = Integer.parseInt(numbertxt.getText());
                int factorial = 1;
                // String to display the multiplication chain (e.g., "5 x 4 x 3 x 2 x 1")
                String expression = "";
                int originalNumber = number;
                
                // CALCULATE: Loop through each number down to 1
                while (number > 0) {
                    // Add Current number to the expression string
                    expression += number;
                    //Accumulate the factorial result
                    factorial *= number;
                    
                    //Add " x " between numbers (but not after the last 1)
                    if (number > 1) {
                        expression += " x ";
                    }
                    number--;
                }
                
                // Show the full calculation chain with result
                resultlbl.setText(originalNumber + "!"  + " → " + expression + " = " + factorial);




            } catch (Exception e) {
                resultlbl.setText("Insert a valid number.");
            }
        });

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);


    }
}