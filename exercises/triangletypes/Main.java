package triangletypes;
import javax.swing.*;
import java.awt.*;


public class Main{
    public static void main(String[] args){
        JFrame jframe = new JFrame("Triangle Types");
        jframe.setLayout(new BorderLayout(15, 15)); // horizontal and vertical spacing between the main sections.
        jframe.getRootPane().setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Added padding around the window contents.

        //TITLE
        JPanel jtitle = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Centered the title inside its panel.
        JLabel titlelbl = new JLabel("TRIANGLE TYPES");
        titlelbl.setFont(new Font("SansSerif", Font.BOLD, 22));
        jtitle.add(titlelbl);

        //BODY
        JPanel controls = new JPanel(new GridLayout(4, 2, 10, 10)); // Arranged labels, fields, and the button into a consistent form.
        controls.setBorder(BorderFactory.createTitledBorder("Triangle sides")); // Added a visible border and section title.
        JLabel sidea_lbl = new JLabel("Side A:");
        JTextField sidea_txtf = new JTextField(8);
        JLabel sideb_lbl = new JLabel("Side B:");
        JTextField sideb_txtf = new JTextField(8);
        JLabel sidec_lbl = new JLabel("Side C:");
        JTextField sidec_txtf = new JTextField(8);

        JButton findout = new JButton("Check triangle");


        JLabel resultlbl = new JLabel("Enter the three side lengths, then click Check triangle.", SwingConstants.CENTER); // Added useful initial guidance.
        resultlbl.setFont(new Font("SansSerif", Font.PLAIN, 14)); // Improved the result text readability.



        controls.add(sidea_lbl);
        controls.add(sidea_txtf);
        controls.add(sideb_lbl);
        controls.add(sideb_txtf);
        controls.add(sidec_lbl);
        controls.add(sidec_txtf);
        controls.add(new JLabel());
        controls.add(findout);

        JPanel resultPanel = new JPanel(new BorderLayout()); // panel for the result message.
        resultPanel.setBorder(BorderFactory.createTitledBorder("Result"));
        resultPanel.add(resultlbl, BorderLayout.CENTER);

        jframe.add(jtitle, BorderLayout.NORTH);
        jframe.add(controls, BorderLayout.CENTER);
        jframe.add(resultPanel, BorderLayout.SOUTH);

        findout.addActionListener(event -> {
            try {

                int a = Integer.parseInt(sidea_txtf.getText());
                int b = Integer.parseInt(sideb_txtf.getText());
                int c = Integer.parseInt(sidec_txtf.getText());
                boolean triangle = false;


                if (a<b+c && b<a+c && c<a+b){
                    triangle = true;
                    if (a == b && b ==c){
                        resultlbl.setText("It forms an Equilateral triangle.");
                    } else if(a!=b && b!=c && a!=c){
                        resultlbl.setText("It forms a Scalene triangle.");

                    } else{
                        resultlbl.setText("It forms a Isosceles triangle");
                    }
                } else {
                    resultlbl.setText("Does not forms a triangle.");
                }


            } catch (NumberFormatException e) { // Catch only invalid numeric input instead of every possible exception.
                resultlbl.setText("Please enter valid numbers."); // Displayed a clearer validation message.
            }




        });
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack(); // Size the window according to the components
        jframe.setMinimumSize(new Dimension(420, 300)); // Prevent the form from becoming too small to use.
        jframe.setLocationRelativeTo(null); // Centered the window on the screen.
        jframe.setVisible(true);
    }
}