package Listeners.JCheckBoxWindow;

import javax.swing.*;
import java.awt.*;

public class WindowJCheckBoxONLYGUI extends JFrame {
    private JLabel outputText;

    private JCheckBox cBox1;
    private JCheckBox cBox2;
    private JCheckBox cBox3;
    private JCheckBox cBox4;



    public WindowJCheckBoxONLYGUI() {
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
        cBox1 = new JCheckBox("Opción A");
        cBox2 = new JCheckBox("Opción B");
        cBox3 = new JCheckBox("Opción C");
        cBox4 = new JCheckBox("Opción D");

        p.add(cBox1);
        p.add(cBox2);
        p.add(cBox3);
        p.add(cBox4);
    }


    public static void main(String[] args) {
        WindowJCheckBoxONLYGUI w = new WindowJCheckBoxONLYGUI();
    }
}