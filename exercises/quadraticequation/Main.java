package quadraticequation;
import java.awt.*;
import javax.swing.*;


public class Main{
    public static void main(String[] args){

        JFrame frame = new JFrame("quadratic equation");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);

        JPanel controls = new JPanel(new FlowLayout());


        //Title panel
        JPanel titleP = new JPanel(new FlowLayout());
        JLabel title = new JLabel("<html>--QUADRATIC EQUATION--<br></html>");
        titleP.add(title);

        //controls panel
        JLabel a_value = new JLabel("Enter 'a' values: ");
        JTextField la = new JTextField(2);
        JLabel b_value = new JLabel("Enter 'b' values: ");
        JTextField lb = new JTextField(2);
        JLabel c_value = new JLabel("Enter 'c' values: ");
        JTextField lc = new JTextField(2);
        JButton calculatebtn = new JButton("Calculate");
        controls.add(a_value);
        controls.add(la);
        controls.add(b_value);
        controls.add(lb);
        controls.add(c_value);
        controls.add(lc);
        controls.add(calculatebtn);

        JLabel resultslbl = new JLabel("RESULTS:");


        frame.add(titleP, BorderLayout.NORTH);
        frame.add(controls, BorderLayout.CENTER);
        frame.add(resultslbl, BorderLayout.SOUTH);

        //button action
        calculatebtn.addActionListener(event -> {
            try {
                double av = Double.parseDouble(la.getText());
                double bv = Double.parseDouble(lb.getText());
                double cv = Double.parseDouble(lc.getText());
                double discriminant = Math.pow(bv, 2) - (4 * av * cv);
                if (av == 0) {
                    resultslbl.setText("Not a quadratic equation.");
                } else if (discriminant > 0) {
                    double x1 = (-bv + Math.sqrt(discriminant)) / (2 * av);
                    double x2 = (-bv - Math.sqrt(discriminant)) / (2 * av);
                    resultslbl.setText("<html>" + "RESULTS:<br>" +
                            "x1 = " + x1 +
                            "<br>x2 = " + x2 +
                            "</html>");
                } else if (discriminant == 0) {
                    double x = -bv / (2 * av);
                    resultslbl.setText("<html>RESULTS:<br>" +
                            "x = " + x +
                            "</html>");
                } else {
                    resultslbl.setText("There are no real roots.");
                }


                la.setText("");
                lb.setText("");
                lc.setText("");
            } catch (Exception e) {
                resultslbl.setText("<html>Please enter valid values. </html>" + e);
            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}