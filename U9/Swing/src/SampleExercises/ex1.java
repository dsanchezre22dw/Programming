package SampleExercises;

import javax.swing.*;
import java.awt.*;

public class ex1 extends JFrame {


    public static void main(String[] args){

        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] ages ={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        JComboBox comboage = new JComboBox(ages);
        comboage.setPreferredSize(new Dimension(105,100));

        ButtonGroup group = new ButtonGroup();
        JRadioButton radiobutton1 = new JRadioButton("Male");
        JRadioButton radiobutton2 = new JRadioButton("Female");
        group.add(radiobutton1);
        group.add(radiobutton2);

        frame.getContentPane().add(comboage, BorderLayout.WEST);

        frame.getContentPane().add(radiobutton1, BorderLayout.EAST);
        frame.getContentPane().add(radiobutton2, BorderLayout.EAST);



        frame.pack();
        frame.setVisible(true);

    }
}
