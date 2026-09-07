package Swing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
            JFrame jFrame = new JFrame("Simple GUI");
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(500,500);
            jFrame.add(new JLabel("Hello world"));
            jFrame.add(new JButton("Click me"));
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
    }
}