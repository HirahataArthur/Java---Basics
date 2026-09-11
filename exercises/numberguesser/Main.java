package numberguesser;
import java.awt.*;
import javax.swing.*;


public class Main{
    public static void main (String[] args){
        JFrame jFrame = new JFrame("Number guesser");
        jFrame.setLayout(new BorderLayout());
        jFrame.setSize(500, 500);

        JPanel controls = new JPanel(new FlowLayout());
        controls.add(new JLabel("IM THINKING OF A NUMBER FROM 1 TO 10: "));
        JTextField userguess = new JTextField(5);
        controls.add(userguess);

        JButton guessbtn = new JButton("GUESS");
        controls.add(guessbtn);
        jFrame.add(controls, BorderLayout.NORTH);

        JLabel resultlbl = new JLabel("Results:");
        jFrame.add(resultlbl, BorderLayout.SOUTH);


        guessbtn.addActionListener(( event -> {
            try {

                double usergss = Double.parseDouble(userguess.getText());
                double random = Math.random();
                int pcnumber = (int) (random *(10-1));
                String result = (usergss==pcnumber)?"GOT IT!":"DIDN´T GET IT RIGHT.";

                resultlbl.setText("<html>RESULTS: " +
                        "<br>YOUR NUMBER: " + String.format("%.0f", usergss) +
                        "<br>I WAS THINKING ON THE NUMBER: " + pcnumber +
                        "<br>YOU " + result +
                        "</html>");
                userguess.setText("");


            } catch (Exception e) {
                resultlbl.setText("Please insert a valid number.");
                userguess.setText("");
            }
        }));




        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}