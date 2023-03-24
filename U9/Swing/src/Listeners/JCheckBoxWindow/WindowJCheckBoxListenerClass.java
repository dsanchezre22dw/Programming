package Listeners.JCheckBoxWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowJCheckBoxListenerClass extends JFrame{
    private JLabel outputText;

    private JCheckBox cBox1;
    private JCheckBox cBox2;
    private JCheckBox cBox3;
    private JCheckBox cBox4;



    public WindowJCheckBoxListenerClass() {
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



        cBox1.addActionListener(new JCheckBoxListener());
        cBox2.addActionListener(new JCheckBoxListener());
        cBox3.addActionListener(new JCheckBoxListener());
        cBox4.addActionListener(new JCheckBoxListener());

        p.add(cBox1);
        p.add(cBox2);
        p.add(cBox3);
        p.add(cBox4);
    }


    public static void main(String[] args) {
        WindowJCheckBoxListenerClass w = new WindowJCheckBoxListenerClass();
    }

    class JCheckBoxListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            outputText.setText((cBox1.isSelected()?"A":"") + (cBox2.isSelected()?"B":"") + (cBox3.isSelected()?"C":"") + (cBox4.isSelected()?"D":""));

        }
    }
}