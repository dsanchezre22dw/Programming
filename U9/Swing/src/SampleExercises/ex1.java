package SampleExercises;

import javax.swing.*;
import java.awt.*;

public class ex1 extends JFrame {


    public static void main(String[] args){

        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] ages = new String[20];

        for (int i = 1; i <= 20; i++){
            ages[i-1] = ""+i;
        }

        JComboBox comboage = new JComboBox(ages);
        comboage.setPreferredSize(new Dimension(105,100));

        ButtonGroup group = new ButtonGroup();
        JRadioButton radiobutton1 = new JRadioButton("Male");
        JRadioButton radiobutton2 = new JRadioButton("Female");
        group.add(radiobutton1);
        group.add(radiobutton2);

        frame.getContentPane().add(comboage, BorderLayout.WEST);

        frame.getContentPane().add(radiobutton1, BorderLayout.EAST);
        frame.getContentPane().add(radiobutton2, BorderLayout.SOUTH);



        frame.pack();
        frame.setVisible(true);

    }
}
