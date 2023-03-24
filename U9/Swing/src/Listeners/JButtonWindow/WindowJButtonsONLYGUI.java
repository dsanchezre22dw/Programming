package Listeners.JButtonWindow;

import javax.swing.*;
import java.awt.*;

public class WindowJButtonsONLYGUI extends JFrame {
    private JLabel outputText;

    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;


    public WindowJButtonsONLYGUI() {
        Container p = this.getContentPane();

        this.setTitle("Prueba JButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                manager.close(); // Closing database
            }
        });

        manager = new PhotographerManager(); // Initializing database*/

        p.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Ventana de prueba");


        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));
        panelCentro.setBackground(Color.BLUE);
        addComponentsToCneter(panelCentro);

        outputText = new JLabel();
        outputText.setPreferredSize(new Dimension(120, 40));

        p.add("North", titulo);
        p.add("Center", panelCentro);
        p.add("South", outputText);

        this.setVisible(true);
        this.setSize(300, 200);
    }

    public void addComponentsToCneter(Container p) {
        ButtonGroup group = new ButtonGroup();

        button1 = new JRadioButton("Boton 1");
        button2 = new JRadioButton("Boton 2");
        button3 = new JRadioButton("Boton 3");
        button4 = new JRadioButton("Boton 4");
        button1.setSelected(true);

        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);

    }


    public static void main(String[] args) {
        WindowJButtonsONLYGUI w = new WindowJButtonsONLYGUI();
    }
}