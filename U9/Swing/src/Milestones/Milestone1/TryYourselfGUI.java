package Milestones.Milestone1;

import javax.swing.*;
import java.awt.*;

public class TryYourselfGUI extends JFrame{

    public TryYourselfGUI(){

        this.setTitle("Try yourself");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setPreferredSize(new Dimension(800,400));

        Container container = this.getContentPane();

        JPanel northPanel = new JPanel(new FlowLayout());
        addToNorthPanel(northPanel);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
        eastPanel.setPreferredSize(new Dimension(250, 0));
        eastPanel.setBorder(BorderFactory.createEmptyBorder(90, 40, 0, 0));
        addToEastPanel(eastPanel);


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.X_AXIS));
        southPanel.setPreferredSize(new Dimension(0, 50));
        addToSouthPanel(southPanel);

        JPanel centerPanel = new JPanel(new GridLayout(2,2));
        centerPanel.setPreferredSize(new Dimension(400, 200));
        addToCenterPanel(centerPanel);

        container.add(northPanel, BorderLayout.NORTH);
        container.add(eastPanel, BorderLayout.EAST);
        container.add(southPanel, BorderLayout.SOUTH);
        container.add(centerPanel, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    public void addToNorthPanel(JPanel panel){
        JCheckBox checkbox1 = new JCheckBox("Katniss");
        JCheckBox checkbox2 = new JCheckBox("Peeta");

        panel.add(checkbox1);
        panel.add(checkbox2);

    }


    public void addToEastPanel(JPanel panel){
        ButtonGroup group = new ButtonGroup();
        JRadioButton[] arraybuttons = new JRadioButton[3];
        arraybuttons[0] = new JRadioButton("OPT 1", true);
        arraybuttons[1] = new JRadioButton("OPT 2");
        arraybuttons[2] = new JRadioButton("OPT 3");

        for (JRadioButton button : arraybuttons) {
            group.add(button);
            panel.add(button);
        }
    }

    public void addToSouthPanel(JPanel panel){
        JButton button1 = new JButton("But 1");
        JButton button2 = new JButton("But 2");

        panel.add(button1);
        panel.add(button2);

    }

    public void addToCenterPanel(JPanel panel){
        ImageIcon icon = new ImageIcon("src/Milestones/Milestone1/imagen.jpg");

        for (int i = 0; i < 4; i++) {
            JLabel label = new JLabel(icon);
            //label.setPreferredSize(new Dimension(100,100));
            panel.add(label);
        }

    }


    public static void main(String[] args) {
        TryYourselfGUI window = new TryYourselfGUI();

    }
}
